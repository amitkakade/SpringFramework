/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.replace_method_tag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverReplaceMethodTag {

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/replace_method_tag/configuration.xml");
        
        System.out.println("Using Normal dependency injection.");
        Bank b_1 = (Bank) context.getBean("bank");
        System.out.println(b_1.withdraw());
        System.out.println(b_1.deposit());
        System.out.println(b_1.balance());
        
        System.out.println("\nUsing replace-method tag");
        Bank b_2 = (Bank) context.getBean("bank_replace_method");
        System.out.println(b_2.withdraw());
        System.out.println(b_2.deposit());
        System.out.println(b_2.balance());
        
    }
    
}
