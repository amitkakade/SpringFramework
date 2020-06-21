/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author amit
 */
public class Employee {

    @Autowired
    @Qualifier("company2")
    private Company company;

    @Override
    public String toString() {
        return company+"";
    }
    
}
