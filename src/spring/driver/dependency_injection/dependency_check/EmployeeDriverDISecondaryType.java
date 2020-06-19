/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.dependency_check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * AS dependency check is depricated in spring 3.0 on-wards. Therefore using one
 *
 * @Required annotation
 *
 * @author amit
 */
public class EmployeeDriverDISecondaryType {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/dependency_check/configuration.xml");

        System.out.println("\nBy using reference");
        Employee emp = (Employee) context.getBean("employee");
        System.out.println(emp);

    }

}
