/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.static_variable;

/**
 *
 * @author amit
 */
public class Employee {

    private static String name;

    /**
     * @param aName the name to set
     */
    public static void setName(String aName) {
        Employee.name = aName;
    }

    @Override
    public String toString() {
        return "Employee Name: " + Employee.name;
    }
    
}
