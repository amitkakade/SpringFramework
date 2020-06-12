/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.singleton_scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author amit
 */
public class EmployeeDriverCoreContainer {
    public static void main(String[] args) {
        Resource r = new ClassPathResource("/spring/driver/singleton_scope/configuration.xml");
        BeanFactory bf = new XmlBeanFactory(r);
        System.out.println("after calling r.getBean() Object is created");
        Employee emp1 = (Employee) bf.getBean("employee");
        Employee emp2 = (Employee) bf.getBean("employee");
        Employee emp3 = (Employee) bf.getBean("employee");
        
        System.out.println(emp1 == emp2);
        System.out.println(emp2 == emp3);
    }
}
