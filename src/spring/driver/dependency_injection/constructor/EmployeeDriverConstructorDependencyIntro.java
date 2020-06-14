/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class EmployeeDriverConstructorDependencyIntro {

    public static void main(String[] args) {
        ApplicationContext contxt = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/constructor/configuration.xml");

        System.out.println("\nCreating Employee with String constructor");
        Employee emp = (Employee) contxt.getBean("employee_name");
        System.out.println(emp);

        System.out.println("\nCreating Employee with int constructor");
        emp = (Employee) contxt.getBean("employee_id");
        System.out.println(emp);
        
        System.out.println("\nCreating Employee with constructor following arguments");
        emp = (Employee) contxt.getBean("employee");
        System.out.println(emp);
        
        System.out.println("\nCreating Employee with constructor following index");
        emp = (Employee) contxt.getBean("employee_index");
        System.out.println(emp);
    }
}
