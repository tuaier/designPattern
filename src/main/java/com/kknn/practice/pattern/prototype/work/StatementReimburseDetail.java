package com.kknn.practice.pattern.prototype.work;

import java.io.*;

/**
 * @author tuaier
 */
public class StatementReimburseDetail implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 摘要
     */
    private String summary;
    /**
     * 项目信息
     */
    private Project project;

    /**
     * 订单类型
     */
    private Integer type;


    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    protected Object clone() {

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            StatementReimburseDetail copy = (StatementReimburseDetail) ois.readObject();
            return copy;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "StatementReimburseDetail{" +
                ", summary=" + summary +
                ", project=" + project +
                ", type=" + type +
                "}";
    }
}
