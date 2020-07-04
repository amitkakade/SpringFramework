/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.singletonclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverSingletonClass {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/singletonclass/configuration.xml");
        SingletonClass singletonClass_1 = (SingletonClass) context.getBean("singleton");
        SingletonClass singletonClass_2 = (SingletonClass) context.getBean("singleton");
        System.out.println(singletonClass_1 == singletonClass_2);

    }

}
