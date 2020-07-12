/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.j2ee_stero_type_named;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverSteroType {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/j2ee_stero_type_named/configuration.xml");
        Employee_Parent employee = (Employee_Parent) context.getBean(Employee_Parent.class);
        System.out.println(employee);

    }
    
}
