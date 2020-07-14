package com.kknn.practice.pattern.state.general.apply;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(Context.STATE_A);
        context.handle();
    }
}
