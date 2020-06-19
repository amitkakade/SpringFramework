/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.collection_xsd.properties;

import java.util.Properties;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author amit
 */
public class PropertiesDriver {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("/spring/driver/dependency_injection/collection_xsd/properties/configuration.xml");
        BeanFactory bf = new XmlBeanFactory(resource);
        Drivers drivers = (Drivers) bf.getBean("drivers");
        Properties properties = drivers.getProperties();
        System.out.println("\nPrinting Driver information");
        properties.entrySet().forEach(System.out::println);
    }
    
}
