package com.kknn.practice.pattern.state.general.apply;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public class Context {

    public static final State STATE_A = new ConcreteStateA();
    public static final State STATE_B = new ConcreteStateB();

    {
        STATE_A.setContext(this);
        STATE_B.setContext(this);
    }

    private State currentState = STATE_A;

    public void setState(State state) {
        this.currentState = state;
        this.currentState.setContext(this);
    }

    public State getState() {
        return this.currentState;
    }

    public void handle() {
        this.currentState.handle();
    }
}
