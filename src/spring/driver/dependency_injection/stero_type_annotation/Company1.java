/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.stero_type_annotation;

import javax.persistence.Entity;
import org.springframework.stereotype.Component;


/**
 *
 * @author amit
 */
@Component
public class Company1 {
    
    private String name = "Deskera";

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
