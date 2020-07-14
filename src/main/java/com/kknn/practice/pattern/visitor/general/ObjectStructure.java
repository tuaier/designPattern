package com.kknn.practice.pattern.visitor.general;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<IElement> mList = new ArrayList<>();

    {
        this.mList.add(new ConcreteElementA());
        this.mList.add(new ConcreteElementB());
    }

    public void accept(IVisitor visitor) {
        for (IElement element : this.mList) {
            element.accept(visitor);
        }
    }
}
