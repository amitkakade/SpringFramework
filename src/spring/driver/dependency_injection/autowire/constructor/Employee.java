/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.autowire.constructor;

/**
 *
 * @author amit
 */
public class Employee {

    private Company company;

    public Employee(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return company.toString();
    }
    
}
