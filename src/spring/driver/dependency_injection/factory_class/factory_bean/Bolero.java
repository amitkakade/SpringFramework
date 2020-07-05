/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.factory_class.factory_bean;

/**
 *
 * @author amit
 */
public class Bolero implements Car {

    @Override
    public String driveCar() {
        System.out.println("Driving car Bolero .....");
        return "";
    }
    
}
