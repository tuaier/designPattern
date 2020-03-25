package com.kknn.practice.pattern.interpreter.calculate;

public class Test {

    public static void main(String[] args) {
        System.out.println("result: " + new GPCalculator("10 + 30").calculate());
        System.out.println("result: " + new GPCalculator("10 + 30 - 20").calculate());
        System.out.println("result: " + new GPCalculator("100 * ( 2 + 400 ) * 1 + 66").calculate());
    }

}