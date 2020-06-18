/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.collection_dtd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverCollectionInterface {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/collection_dtd/configuration.xml");
        Company comp = (Company) context.getBean("company");
        
        System.out.println("\nPrinting company names: ");
        comp.getCompany_names().stream().forEach(System.out::println);
        
        System.out.println("\nPrinting top employee names: ");
        comp.getTop_employees().stream().forEach(System.out::println);
        
        System.out.println("\nPrinting company-employee names: ");
        comp.getCompany_employee().entrySet().stream().forEach((obj) -> {
            System.out.println(obj.getKey() + "=" + obj.getValue());
        });
        
    }
    
}
