/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.stero_type_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverSteroType {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/stero_type_annotation/configuration.xml");
        Employee1 employee = (Employee1) context.getBean(Employee1.class);
        System.out.println(employee);        
        
    }

}
