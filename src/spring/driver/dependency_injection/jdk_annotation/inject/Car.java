/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.jdk_annotation.inject;

import javax.inject.Inject;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 *
 * @author amit
 */
public class Car {

    @Inject
//    @Qualifier("engine_1")
    @Qualifier("engine_2")
    private Engine engine;

    /**
     * @return the engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine the engine to set
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    
}
