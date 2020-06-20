/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.depends_on;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author amit
 */
public class DriverDependsOn {

    public static void main(String[] args) {
        Resource resource = new ClassPathResource("/spring/driver/dependency_injection/depends_on/configuration.xml");
        BeanFactory bf = new XmlBeanFactory(resource);
        A a = (A) bf.getBean("a");
        List list = Stream.of(a.getB().getC().getMessages()).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
    
}
