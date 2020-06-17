/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.primitive_array;

import java.util.stream.Stream;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author amit
 */
public class EmployeeDriverSetterDependencyIntro {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("/spring/driver/dependency_injection/primitive_array/configuration.xml");
        BeanFactory bf = new XmlBeanFactory(r);

        /**
         * With Setter DI
         */
        Employee emp = (Employee) bf.getBean("employee");
        System.out.println("\nDisplaying array data with setter-dependency");
        Stream.of(emp.getLanguages_known()).forEach((s)->System.out.println(s));
        
        /**
         * With Constructor DI
         */
        emp = (Employee) bf.getBean("employee_constructor");
        System.out.println("\nDisplaying array data with constructor-dependency");
        Stream.of(emp.getLanguages_known()).forEach((s)->System.out.println(s));
        
    }
}
