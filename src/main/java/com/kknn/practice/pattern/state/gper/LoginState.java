package com.kknn.practice.pattern.state.gper;

/**
 * @author kangfw5
 * @since 2020-07-13
 */
public class LoginState extends UserState {
    @Override
    public void favorite() {
        System.out.println("收藏成功");
    }

    @Override
    public void comment(String comment) {
        System.out.println("评论成功");
    }
}
