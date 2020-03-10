package com.kknn.practice.pattern.adapter.passport.v1.service;

import com.kknn.practice.pattern.adapter.passport.Member;
import com.kknn.practice.pattern.adapter.passport.ResultMsg;

public class SiginService {

    /**
     * 注册方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password){
        return  new ResultMsg(200,"注册成功",new Member());
    }

    /**
     * 登录的方法
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username,String password){
        return null;
    }

}
