/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.primitive_array;

import spring.driver.dependency_injection.setter.*;

/**
 *
 * @author amit
 */
public class Employee {

    private String name;
    private int id;
    private String gender;
    private String[] languages_known;

    private Employee() {
        System.out.println("Created Employee ...");
    }

    private Employee(String name, int id, String gender, String[] languages_known) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.languages_known = languages_known;
        System.out.println("\nCreated Employee with constructor DI.....");
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @param languages_known the languages_known to set
     */
    public void setLanguages_known(String[] languages_known) {
        this.languages_known = languages_known;
    }
    
    /**
     * @param languages_known the languages_known to set
     */
    public String[] getLanguages_known() {
        return this.languages_known;
    }

    @Override
    public String toString() {
        return "Employee Name: " + this.name + " | Employee ID: " + this.id + " | Gender: " + this.gender;
    }

}
