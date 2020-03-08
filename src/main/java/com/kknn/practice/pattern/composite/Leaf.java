package com.kknn.practice.pattern.composite;

/**
 * leaf node, no son node, so add(Document doc) and remove(Document doc) is not supported
 */
public class Leaf extends Document {
    private String text;

    public Leaf(String text) {
        this.text = text;
    }

    @Override
    public void add(Document document) {
        throw new UnsupportedOperationException("unsupported operation!");
    }

    @Override
    public void remove(Document document) {
        throw new UnsupportedOperationException("unsupported operation!");
    }

    @Override
    public String show(int indent) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            builder.append(" ");
        }
        builder.append(text).append("\n");
        return builder.toString();
    }
}
