package com.kknn.practice.pattern.visitor.general;

public interface IVisitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}
