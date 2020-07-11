/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.lookup_method.concretelass;

/**
 *
 * @author amit
 */
public class Truck {

    public Engine getTruckEngine() {
        Engine e = new Engine();
        e.setName("TATA Engine");
        return e;
    }
    
}
