package com.kknn.practice.pattern.prototype.work;

import java.util.Date;

/**
 * @author kangfw5
 * @since 2019-05-29
 */
public class StatementTest {

    public static void main(String[] args) {
        StatementReimburseDetail s = new StatementReimburseDetail();
        s.setSummary("测试");
        s.setType(1);
        Project project = new Project();
        project.setCode("1");
        project.setBeginDate(new Date());
        s.setProject(project);

        StatementReimburseDetail clone = (StatementReimburseDetail) s.clone();

        System.out.println(clone);
    }
}
