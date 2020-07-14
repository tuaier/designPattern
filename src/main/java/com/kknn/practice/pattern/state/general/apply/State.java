package com.kknn.practice.pattern.state.general.apply;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle();
}
