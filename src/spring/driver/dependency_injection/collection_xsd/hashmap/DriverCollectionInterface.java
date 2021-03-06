/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.collection_xsd.hashmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverCollectionInterface {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/collection_xsd/hashmap/configuration.xml");
        Company comp = (Company) context.getBean("company");

        System.out.println("\nPrinting company names with employee: ");
        comp.getCompany_names().entrySet().stream().forEach(System.out::println);

    }

}
