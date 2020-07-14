package com.kknn.practice.pattern.visitor.general;

public class ConcreteVisitorA implements IVisitor {
    @Override
    public void visit(ConcreteElementA element) {
        String result = element.operationA();
        System.out.println("result from " + element.getClass().getSimpleName() + ": " + result);
    }

    @Override
    public void visit(ConcreteElementB element) {
        String result = element.operationB();
        System.out.println("result from " + element.getClass().getSimpleName() + ": " + result);
    }
}
