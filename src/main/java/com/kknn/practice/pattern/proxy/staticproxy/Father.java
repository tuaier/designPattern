package com.kknn.practice.pattern.proxy.staticproxy;

import com.kknn.practice.pattern.proxy.Person;

/**
 * @author kangfw5
 * @date 2019-06-25
 */
public class Father implements Person {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("父亲物色对象");
        this.son.findLove();
        System.out.println("父母同意，确定关系");
    }
}
