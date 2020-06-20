/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.autowire.auto_detect;

/**
 *
 * @author amit
 */
public class Employee {

    private Company company;

    /**
     * Un-Comment Follwoing Default constructor for Setter DI.
     */
    //public Employee() {
    //    System.out.println("Not using Constructor for Dependency Injection.");
    //}

    public Employee(Company company) {
        System.out.println("Using Constructor for Dependency Injection.");
        this.company = company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
        System.out.println("Using Setter method for Dependency Injection.");
        this.company = company;
    }

    @Override
    public String toString() {
        return company.toString();
    }
    
}
