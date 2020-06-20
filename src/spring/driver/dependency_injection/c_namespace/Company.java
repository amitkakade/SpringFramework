/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.c_namespace;

/**
 *
 * @author amit
 */
public class Company {

    private String name;
    private String city;

    public Company(String name, String city) {
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Company Name: " + this.name + " | Company City: " + this.city;
    }

}
