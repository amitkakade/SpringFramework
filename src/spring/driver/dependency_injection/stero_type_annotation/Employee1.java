/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.stero_type_annotation;

import javax.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author amit
 */
@Component
public class Employee1 {

    private String name;
    @Autowired
    private Company1 company;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee Name: "+this.name+" | Company Name: "+this.company.getName();
    }
    
}
