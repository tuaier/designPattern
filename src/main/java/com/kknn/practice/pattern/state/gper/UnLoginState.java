package com.kknn.practice.pattern.state.gper;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public class UnLoginState extends UserState {
    @Override
    public void favorite() {
        this.switch2Login();
        this.context.getState().favorite();
    }

    @Override
    public void comment(String comment) {
        this.switch2Login();
        this.context.getState().comment(comment);
    }

    private void switch2Login() {
        System.out.println("跳转到登录页");
        this.context.setState(AppContext.STATE_LOGIN);
    }
}
