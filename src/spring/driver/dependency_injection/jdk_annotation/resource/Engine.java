/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.jdk_annotation.resource;

/**
 *
 * @author amit
 */
public class Engine {

    private String name;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Engine Name: " + this.name;
    }

}
