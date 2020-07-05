/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.factory_class.static_method;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author amit
 */
public class CarFactory {

    private static String car_name;

    /**
     * @param aCar_name the car_name to set
     */
    public static void setCar_name(String aCar_name) {
        CarFactory.car_name = aCar_name;
    }

    public static Car getCar() {
        Car c = null;
        try {
            c = (Car) Class.forName(CarFactory.car_name).newInstance();
        } catch (InstantiationException | ClassNotFoundException | IllegalAccessException ex) {
            Logger.getLogger(CarFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
}
