/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.jdk_annotation.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverResourceAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/jdk_annotation/resource/configuration.xml");
        Car c = (Car) context.getBean("car");
        System.out.println(c.getEngine());
    }
}
