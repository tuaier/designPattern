package com.kknn.practice.pattern.interpreter.calculate.interpreter;

public abstract class Interpreter implements IArithmeticInterpreter {

    protected IArithmeticInterpreter left;
    protected IArithmeticInterpreter right;
    int level;

    public Interpreter(IArithmeticInterpreter left, IArithmeticInterpreter right, int level) {
        this.left = left;
        this.right = right;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}