package com.kknn.practice.pattern.composite;

public class YmlTest {
    public static void main(String[] args) {
        //创建根元素
        Document root = DocumentHelper.createRootDocument();
        //创建两个子元素A合B
        Document a = DocumentHelper.createElement("A");
        Document b = DocumentHelper.createElement("B");
        //存入子元素到根元素
        root.add(a);
        root.add(b);
        //在子元素A下再创建一个子元素A1
        Document a1 = DocumentHelper.createElement("A1");
        a.add(a1);
        //在子元素A1下创建文本
        Document text = DocumentHelper.createText("叶子1");
        a1.add(text);
        //在B元素下创建文本
        Document text2 = DocumentHelper.createText("叶子2");
        b.add(text2);
        //显示xml
        DocumentHelper.printDocument(root);
    }
}
