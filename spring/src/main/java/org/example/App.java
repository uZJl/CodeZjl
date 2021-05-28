package org.example;

/**
 * Created by JiaLe on 2021/5/28 22:17
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("beans.xml");
        ((ClassPathXmlApplicationContext) context).close();
    }
}
