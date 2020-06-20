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
public class Employee {


    private int id;
    private String name;
    private int salary;
    private Company company;

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
        this.company = company;
    }
    
    @Override
    public String toString() {
        return "Employee ID: " + this.id + " | Name: " + this.name + " | Salary: " + this.salary + " | " + this.company;
    }

}
