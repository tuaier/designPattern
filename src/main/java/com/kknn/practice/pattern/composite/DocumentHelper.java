package com.kknn.practice.pattern.composite;

public class DocumentHelper {
    public static Document createRootDocument() {
        Document root = new Element("R");
        return root;
    }

    public static Document createElement(String name) {
        return new Element(name);
    }

    public static Document createText(String content) {
        return new Leaf(content);
    }

    public static void printDocument(Document root) {
        String xml = root.show(0);
        System.out.println(xml);
    }
}
