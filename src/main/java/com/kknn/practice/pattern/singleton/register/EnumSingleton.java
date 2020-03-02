package com.kknn.practice.pattern.singleton.register;

/**
 * @author kangfw5
 * @since 2019-05-28
 */
public enum EnumSingleton {
    /**
     * 枚举实例
     */
    INSTANCE;

    private Object data;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
