/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.constructor;

/**
 *
 * @author amit
 */
public class Employee {

    private String name;
    private int id = 1;
    private String gender = "male";

    private Employee(String name) {
        System.out.println("Created Employee ...");
        this.name = name;
    }

    private Employee(String name, int id, String gender) {
        System.out.println("Created Employee ...");
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    private Employee(int id) {
        System.out.println("Created Employee ...");
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee Name: " + this.name + " | Employee ID: " + this.id + " | Gender: " + this.gender;
    }

}
