/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.setter;

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
        Resource r = new ClassPathResource("/spring/driver/dependency_injection/setter/configuration.xml");
        BeanFactory bf = new XmlBeanFactory(r);
        Employee emp = (Employee) bf.getBean("employee");
        System.out.println(emp);
    }
}
