/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.factory_class.instance_method;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amit
 */
public class CarFactory {

    private String car_name;
   
    /**
     * @param car_name the car_name to set
     */
    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public Car getCar() {
        
        Car c = null;
        try {
            c = (Car) Class.forName(this.car_name).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException ex) {
            Logger.getLogger(CarFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
        
    }

}
