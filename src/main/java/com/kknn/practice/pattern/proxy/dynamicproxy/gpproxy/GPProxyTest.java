package com.kknn.practice.pattern.proxy.dynamicproxy.gpproxy;

import com.kknn.practice.pattern.proxy.Person;
import com.kknn.practice.pattern.proxy.dynamicproxy.jdkproxy.Girl;
import com.kknn.practice.pattern.proxy.dynamicproxy.jdkproxy.Meipo;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author kangfw5
 * @date 2019-06-26
 */
public class GPProxyTest {
    public static void main(String[] args) {
        Person obj = (Person) new GPMeipo().getInstance(new Girl());
        obj.findLove();

       /* byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{Person.class});
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D://$Proxy0.class");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
