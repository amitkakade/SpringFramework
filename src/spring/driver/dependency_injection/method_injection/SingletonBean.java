/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.method_injection;

/**
 *
 * @author amit
 */
public abstract class SingletonBean {

    public SingletonBean() {
        System.out.println("SingleTonBean is Created...");
    }

    public abstract PrototypeBean getProtoTypeBean();
    
}
