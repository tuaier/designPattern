package com.kknn.practice.pattern.visitor.general;

public class ConcreteElementB implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    String operationB() {
        return this.getClass().getSimpleName();
    }
}
