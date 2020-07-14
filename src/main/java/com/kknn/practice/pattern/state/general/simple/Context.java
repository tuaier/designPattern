package com.kknn.practice.pattern.state.general.simple;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public class Context {

    private static final IState STATE_A = new ConcreteStateA();
    private static final IState STATE_B = new ConcreteStateB();

    private IState currentState = STATE_A;

    public void setState(IState state) {
        this.currentState = state;
    }

    public void handle() {
        this.currentState.handle();
    }
}
