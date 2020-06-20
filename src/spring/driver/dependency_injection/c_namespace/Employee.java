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
public class Employee {


    private int id;
    private String name;
    private int salary;
    private Company company;


    public Employee(int id, String name, int salary, Company company) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.company = company;
    }
    
    @Override
    public String toString() {
        return "Employee ID: " + this.id + " | Name: " + this.name + " | Salary: " + this.salary + " | " + this.company;
    }

}
