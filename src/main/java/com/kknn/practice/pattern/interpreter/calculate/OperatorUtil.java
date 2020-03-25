package com.kknn.practice.pattern.interpreter.calculate;

import com.kknn.practice.pattern.interpreter.calculate.interpreter.*;

public class OperatorUtil {
    static final String LEFT = "(";
    static final String RIGHT = ")";
    static final String ADD = "+";
    static final String SUB= "-";
    static final String MULTI = "*";
    static final String DIV = "/";
    /**
     * 匹配 + - * / ( ) 运算符
     */
    static final String SYMBOL = "\\+|-|\\*|/|\\(|\\)";
    /**
     * 加減 + -
     */
    public static final int LEVEL_01 = 1;
    /**
     * 乘除 * /
     */
    public static final int LEVEL_02 = 2;
    /**
     * 括号
     */
    public static final int LEVEL_HIGH = 3;



    public static boolean isOperator(String symbol) {
        return symbol.matches(SYMBOL);
    }

    /**
     * 匹配运算等级
     * @param symbol
     * @return
     */
    public static int calcLevel(String symbol){
        if(ADD.equals(symbol) || SUB.equals(symbol)){
            return LEVEL_01;
        } else if(MULTI.equals(symbol) || DIV.equals(symbol)){
            return LEVEL_02;
        }
        return LEVEL_HIGH;
    }
    public static Interpreter getInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right, String symbol) {
        if (ADD.equals(symbol)) {
            return new AddInterpreter(left, right);
        } else if (SUB.equals(symbol)) {
            return new SubInterpreter(left, right);
        } else if (MULTI.equals(symbol)) {
            return new MultiInterpreter(left, right);
        } else if (DIV.equals(symbol)) {
            return new DivInterpreter(left, right);
        }
        return null;
    }


    /**
     * 去除所有空白符
     * @param s
     * @return
     */
    public static String replaceAllBlank(String s ){
        // \\s+ 匹配任何空白字符，包括空格、制表符、换页符等等, 等价于[ \f\n\r\t\v]
        return s.replaceAll("\\s+","");
    }
}