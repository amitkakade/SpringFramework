/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.lookup_method.abstractclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverAbstractClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/lookup_method/abstractclass/configuration.xml");
        Bus b = (Bus) context.getBean("bus");
        Engine e = b.getBusEngine();
        System.out.println(e.getName());
    }
}
