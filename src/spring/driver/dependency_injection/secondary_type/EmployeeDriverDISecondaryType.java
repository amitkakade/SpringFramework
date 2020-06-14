/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.secondary_type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class EmployeeDriverDISecondaryType {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/secondary_type/configuration.xml");

        System.out.println("\nBy using reference");
        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp);

        System.out.println("\nBy using inner-bean");
        emp = (Employee) context.getBean("employee_innerbean");
        System.out.println(emp);

    }

}
