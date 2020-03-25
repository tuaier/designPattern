package com.kknn.practice.pattern.interpreter.calculate;

import com.kknn.practice.pattern.interpreter.calculate.interpreter.IArithmeticInterpreter;
import com.kknn.practice.pattern.interpreter.calculate.interpreter.NumInterpreter;

import java.util.Arrays;
import java.util.Stack;

public class GPCalculator {
    private Stack<IArithmeticInterpreter> stack = new Stack<>();

    public GPCalculator(String expression) {
        this.parse(expression);
    }

    private void parse(String expression) {
        String[] elements = expression.split(" ");
        System.out.println("解析前的表达式：" + Arrays.toString(elements));
        String[] rpnElements  = parse2rpn(elements);
        System.out.println("解析后的表达式：" + Arrays.toString(rpnElements));

        IArithmeticInterpreter leftExpr, rightExpr;
        for (int i = 0; i < rpnElements.length ; i++) {
            String operator = rpnElements[i];
            if (OperatorUtil.isOperator(operator)){
                rightExpr = this.stack.pop();
                leftExpr = this.stack.pop();
                //System.out.println("出栈: " + leftExpr.interpret() + " 和 " + rightExpr.interpret());
                this.stack.push(OperatorUtil.getInterpreter(leftExpr, rightExpr, operator));
                //System.out.println("应用运算符: " + operator);
            }
            else{
                NumInterpreter numInterpreter = new NumInterpreter(Integer.valueOf(rpnElements[i]));
                this.stack.push(numInterpreter);
                //System.out.println("入栈: " + numInterpreter.interpret());
            }
        }
    }

    private String[] parse2rpn(String[] elements) {
        //操作符栈
        Stack<String> operStack = new Stack<>();
        String[] rpnStr = new String[elements.length];
        int tempIndex = 0;

        for (int i = 0; i < elements.length; i++) {
            if (OperatorUtil.isOperator(elements[i])) {
                //栈为空
                if (operStack.isEmpty()) {
                    operStack.push(elements[i]);
                } else {
                    if (OperatorUtil.LEFT.equals(elements[i])) {
                        operStack.push(elements[i]);
                    } else if (OperatorUtil.RIGHT.equals(elements[i])) {
                        while(!OperatorUtil.LEFT.equals(operStack.peek())){
                            rpnStr[tempIndex] = operStack.pop();
                            tempIndex += 1;
                        }
                        //"("出栈
                        operStack.pop();
                    } else {
                        if (OperatorUtil.LEFT.equalsIgnoreCase(elements[i])) {
                            operStack.push(elements[i]);
                        } else {
                            if (OperatorUtil.calcLevel(elements[i]) > OperatorUtil.calcLevel(operStack.peek()) || OperatorUtil.LEFT.equals(operStack.peek())) {
                                operStack.push(elements[i]);
                            } else {
                                while (OperatorUtil.calcLevel(elements[i]) <= OperatorUtil.calcLevel(operStack.peek())) {
                                    rpnStr[tempIndex] = operStack.pop();
                                    tempIndex += 1;
                                    //若栈顶全部弹出，则直接入栈
                                    if(operStack.isEmpty()) {
                                        operStack.push(elements[i]);
                                        break;
                                    }
                                }
                                if(OperatorUtil.calcLevel(elements[i]) > OperatorUtil.calcLevel(operStack.peek())){
                                    operStack.push(elements[i]);
                                }
                            }
                        }
                    }
                }
            } else {
                rpnStr[tempIndex] = elements[i];
                tempIndex += 1;
            }
        }

        while(!operStack.isEmpty()){
            rpnStr[tempIndex] = operStack.pop();
            tempIndex += 1;
        }
        String[] arrays3 = new String[tempIndex];
        for(int i = 0; i < tempIndex ;i++){
            arrays3[i] = rpnStr[i];
        }
        return arrays3;
    }

    public int calculate() {
        return this.stack.pop().interpret();
    }
}