package com.kknn.practice.pattern.interpreter.calculate.interpreter;

import com.kknn.practice.pattern.interpreter.calculate.OperatorUtil;

public class MultiInterpreter extends Interpreter {

    public MultiInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right){
        super(left, right, OperatorUtil.LEVEL_02);
    }

    @Override
    public int interpret() {
        return this.left.interpret() * this.right.interpret();
    }
}
