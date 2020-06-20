/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.p_namespace;

/**
 *
 * @author amit
 */
public class Company {

    private String name;
    private String city;

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString(){
        return "Company Name: " + this.name + " | Company City: " + this.city;
    }
    
}
