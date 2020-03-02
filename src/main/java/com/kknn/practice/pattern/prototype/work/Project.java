package com.kknn.practice.pattern.prototype.work;

import java.io.Serializable;
import java.util.Date;

/**
 * @author kangfw5
 * @since 2019-05-29
 */
public class Project implements Serializable {

    private String key;
    private String code;
    private String name;
    private Date beginDate;
    private Date endDate;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

}
