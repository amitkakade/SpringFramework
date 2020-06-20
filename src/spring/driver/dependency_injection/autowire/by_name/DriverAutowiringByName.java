/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.autowire.by_name;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverAutowiringByName {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/autowire/by_name/configuration.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
        
    }

}
