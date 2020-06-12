/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.prototype_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class EmployeeDriverAdvanceContainer {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/prototype_scope/configuration.xml");
        System.out.println("Object is created after calling context.getBean() call");
        Employee emp1 = (Employee) context.getBean("employee");
        Employee emp2 = (Employee) context.getBean("employee");
        Employee emp3 = (Employee) context.getBean("employee");

        System.out.println(emp1 == emp2);
        System.out.println(emp2 == emp3);
    }
    
}
