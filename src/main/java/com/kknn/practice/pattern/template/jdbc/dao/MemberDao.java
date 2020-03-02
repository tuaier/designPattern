package com.kknn.practice.pattern.template.jdbc.dao;

import com.kknn.practice.pattern.template.jdbc.JdbcTemplate;
import com.kknn.practice.pattern.template.jdbc.Member;
import com.kknn.practice.pattern.template.jdbc.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * @author kangfw5
 * @since 2019-07-24
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() {
        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUserName(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setNickname(rs.getString("nickname"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        }, null);
    }
}
