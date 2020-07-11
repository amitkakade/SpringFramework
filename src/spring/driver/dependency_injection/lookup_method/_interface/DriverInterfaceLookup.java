/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.lookup_method._interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverInterfaceLookup {
    
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/lookup_method/_interface/configuration.xml");
        Car c = (Car) context.getBean("car");
        Engine e = (Engine) c.getCarEngine();
        System.out.println(e.getName());
    }
    
}
