package com.kknn.practice.pattern.interpreter.calculate.interpreter;

import com.kknn.practice.pattern.interpreter.calculate.OperatorUtil;
import com.sun.org.apache.xpath.internal.operations.Operation;

public class AddInterpreter extends Interpreter {

    public AddInterpreter(IArithmeticInterpreter left, IArithmeticInterpreter right) {
        super(left, right, OperatorUtil.LEVEL_01);
    }

    @Override
    public int interpret() {
        return this.left.interpret() + this.right.interpret();
    }
}