/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.properties_file_expression;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class PropertiesDriver {

    public static void main(String[] args) {
        
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/properties_file_expression/configuration.xml");
        Drivers d = (Drivers) context.getBean("drivers");
        System.out.println(d);
        
    }
    
}
