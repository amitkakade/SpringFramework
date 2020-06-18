/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.method_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class MethodInjectionDriver {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/dependency_injection/method_injection/configuration.xml");

        SingletonBean sb1 = (SingletonBean) context.getBean("singletonbean");
        PrototypeBean pb1 = (PrototypeBean) sb1.getProtoTypeBean();
        
        SingletonBean sb2 = (SingletonBean) context.getBean("singletonbean");
        PrototypeBean pb2 = (PrototypeBean) sb2.getProtoTypeBean();
        
        System.out.println(pb1 == pb2);
    }
}
