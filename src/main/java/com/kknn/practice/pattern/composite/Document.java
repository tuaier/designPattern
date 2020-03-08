package com.kknn.practice.pattern.composite;

/**
 * document abstract class
 */
public abstract class Document {

    public abstract void add(Document document);

    public abstract void remove(Document document);

    public abstract String show(int indent);
}
