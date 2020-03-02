package com.kknn.practice.pattern.template.jdbc;

import com.kknn.practice.pattern.template.jdbc.dao.MemberDao;

import javax.servlet.http.HttpServlet;
import java.util.List;

/**
 * @author kangfw5
 * @since 2019-07-24
 */
public class MemberDaoTest {
    public static void main(String[] args) {
        MemberDao memberDao =  new MemberDao(null);
        List<?> objects = memberDao.selectAll();
        System.out.println(objects);


    }
}
