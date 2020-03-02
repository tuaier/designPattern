package com.kknn.practice.pattern.singleton.register;

import java.lang.reflect.Constructor;

/**
 * @author kangfw5
 * @since 2019-05-28
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        /*EnumSingleton singleton1 = null;
        EnumSingleton singleton2 = EnumSingleton.getInstance();
        singleton2.setData(new Object());

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            singleton1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(singleton1.getData());
            System.out.println(singleton2.getData());
            System.out.println(singleton1.getData() == singleton2.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }*/

        try {
            Class<EnumSingleton> clazz = EnumSingleton.class;
            Constructor<EnumSingleton> constructor = clazz.getDeclaredConstructor(String.class, int.class);
            constructor.setAccessible(true);

            EnumSingleton singleton = constructor.newInstance("Tom", 666);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
