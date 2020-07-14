package com.kknn.practice.pattern.visitor.general;

public interface IElement {
    void accept(IVisitor visitor);
}
