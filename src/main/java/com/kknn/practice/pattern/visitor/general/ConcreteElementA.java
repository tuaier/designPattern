package com.kknn.practice.pattern.visitor.general;

public class ConcreteElementA implements IElement {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    String operationA() {
        return this.getClass().getSimpleName();
    }
}
