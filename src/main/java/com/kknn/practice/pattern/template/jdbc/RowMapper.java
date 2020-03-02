package com.kknn.practice.pattern.template.jdbc;

import java.sql.ResultSet;

/**
 * @author kangfw5
 * @since 2019-07-23
 */
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
