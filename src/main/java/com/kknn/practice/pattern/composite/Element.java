package com.kknn.practice.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Element node, composite the tree
 */
public class Element extends Document {
    private String name;

    private List<Document> documents = new ArrayList<>();

    public Element(String name) {
        this.name = name;
    }

    @Override
    public void add(Document document) {
        documents.add(document);
    }

    @Override
    public void remove(Document document) {
        documents.remove(document);
    }

    @Override
    public String show(int indent) {
        StringBuilder builder = new StringBuilder();
        //缩进距离
        for (int i = 0; i < indent; i++) {
            builder.append(" ");
        }
        //元素开始标签
        builder.append(name).append(":\n");
        //子元素
        for (Document document : documents) {
            builder.append(document.show(indent + 2));
        }
        return builder.toString();
    }
}
