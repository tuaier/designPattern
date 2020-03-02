package com.kknn.practice.pattern.prototype.simple;

import java.util.List;

/**
 * @author kangfw5
 * @since 2019-05-29
 */
public class ConcretePrototypeA implements Prototype {

    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobbies() {
        return hobbies;
    }

    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public Prototype clone() {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setAge(this.getAge());
        prototypeA.setName(this.getName());
        prototypeA.setHobbies(this.getHobbies());
        return prototypeA;
    }
}
