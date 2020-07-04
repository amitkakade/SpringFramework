/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.singletonclass;

/**
 *
 * @author amit
 */
public class SingletonClass {

    private static SingletonClass singletonClass;

    private SingletonClass() {
        System.out.println("SingletonClass instance is created...");
    }

    public static SingletonClass getInstance() {
        
        if (singletonClass == null) {
            singletonClass = new SingletonClass();
        }
        
        return singletonClass;
    }

}
