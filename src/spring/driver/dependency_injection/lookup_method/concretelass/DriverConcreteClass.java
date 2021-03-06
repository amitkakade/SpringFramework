/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.lookup_method.concretelass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverConcreteClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/lookup_method/concretelass/configuration.xml");
        Truck t = (Truck) context.getBean("truck");
        Engine e =  t.getTruckEngine();
        System.out.println(e.getName());
    }
}
