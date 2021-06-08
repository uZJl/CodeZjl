package org.example;


import org.example.controller.LoginController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JiaLe on 2021/6/8 21:06
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
        //getBean() 命名生成规则：
//        public static String decapitalize(String name) {
//            if (name == null || name.length() == 0) {
//                return name;
//            }
//            if (name.length() > 1 && Character.isUpperCase(name.charAt(1)) &&
//                    Character.isUpperCase(name.charAt(0))){
//                return name;
//            }
//            char chars[] = name.toCharArray();
//            chars[0] = Character.toLowerCase(chars[0]);
//            return new String(chars);
//        }
        LoginController loginController = (LoginController)context.getBean("loginController");
        System.out.println(loginController);

        LoginController loginController2 = context.getBean(LoginController.class);
        System.out.println(loginController2);

        //关闭资源
        ((ClassPathXmlApplicationContext)context).close();
    }
}
