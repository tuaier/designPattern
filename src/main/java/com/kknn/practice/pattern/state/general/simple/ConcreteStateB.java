package com.kknn.practice.pattern.state.general.simple;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public class ConcreteStateB implements IState {
    @Override
    public void handle() {
        System.out.println("stateB do");
    }
}
