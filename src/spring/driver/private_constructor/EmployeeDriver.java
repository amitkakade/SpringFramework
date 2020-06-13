/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.private_constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author amit
 */
public class EmployeeDriver {

    public static void main(String[] args) {
        Resource r = new ClassPathResource("/spring/driver/private_constructor/configuration.xml");
        BeanFactory bf = new XmlBeanFactory(r);
        Employee e = (Employee) bf.getBean("employee");
        System.out.println(e);
    }
    
}
