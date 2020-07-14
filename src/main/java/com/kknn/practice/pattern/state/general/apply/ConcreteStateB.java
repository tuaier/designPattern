package com.kknn.practice.pattern.state.general.apply;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public class ConcreteStateB extends State {
    @Override
    public void handle() {
        System.out.println("stateB do");
    }
}
