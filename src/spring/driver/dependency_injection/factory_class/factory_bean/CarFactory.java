/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.factory_class.factory_bean;

import org.springframework.beans.factory.FactoryBean;

/**
 *
 * @author amit
 */
public class CarFactory implements FactoryBean<Object> {

    private String car_name;

    /**
     * @param car_name the car_name to set
     */
    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    @Override
    public Object getObject() throws Exception {
        return (Car) Class.forName(this.car_name).newInstance();
    }

    @Override
    public Class<?> getObjectType() {
        return CarFactory.class;
    }

    @Override
    public boolean isSingleton() {
        return true; //To change body of generated methods, choose Tools | Templates.
    }

}
