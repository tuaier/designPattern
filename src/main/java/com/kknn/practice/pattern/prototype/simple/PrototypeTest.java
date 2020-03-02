package com.kknn.practice.pattern.prototype.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangfw5
 * @since 2019-05-29
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        List<String> hobbies = new ArrayList();
        hobbies.add("123");
        prototypeA.setHobbies(hobbies);
        prototypeA.setName("tom");
        prototypeA.setAge(19);

        Client client = new Client();
        ConcretePrototypeA copy = (ConcretePrototypeA)client.startClone(prototypeA);
        copy.getHobbies().add("345");

        System.out.println(copy);
        System.out.println(prototypeA);

        System.out.println("克隆对象中的引用类型地址值：" + copy.getHobbies());
        System.out.println("原对象中的引用类型地址值：" + prototypeA.getHobbies());
        System.out.println("对象地址比较："+(copy.getHobbies() == prototypeA.getHobbies()));
    }
}