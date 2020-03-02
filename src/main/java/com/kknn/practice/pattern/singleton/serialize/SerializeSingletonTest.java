package com.kknn.practice.pattern.singleton.serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author kangfw5
 * @since 2019-05-28
 */
public class SerializeSingletonTest {
    public static void main(String[] args) {
        SerializeSingleton singleton1 = null;
        SerializeSingleton singleton2 = SerializeSingleton.getInstance();

        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("SerializeSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(singleton2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SerializeSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            singleton1 = (SerializeSingleton) ois.readObject();
            ois.close();

            System.out.println(singleton1);
            System.out.println(singleton2);
            System.out.println(singleton1 == singleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
