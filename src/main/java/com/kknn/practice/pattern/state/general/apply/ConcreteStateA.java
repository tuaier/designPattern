package com.kknn.practice.pattern.state.general.apply;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public class ConcreteStateA extends State {
    @Override
    public void handle() {
        System.out.println("stateA do");
        //A完成后切换状态到B
        this.context.setState(Context.STATE_B);
        this.context.handle();
    }
}
