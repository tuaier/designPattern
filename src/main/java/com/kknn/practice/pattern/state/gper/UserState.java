package com.kknn.practice.pattern.state.gper;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public abstract class UserState {
    protected AppContext context;

    public void setContext(AppContext context) {
        this.context = context;
    }

    public abstract void favorite();

    public abstract void comment(String comment);
}
