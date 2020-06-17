/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.secondary_array;

/**
 *
 * @author amit
 */
public class Employee {

    private String name;
    private int id;
    private String gender;
    private EmployeeType[] emp_type;

    private Employee() {
        System.out.println("Created Employee ...");
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
     * @param emp_type the emp_type to set
     */
    public void setEmp_type(EmployeeType[] emp_type) {
        this.emp_type = emp_type;
    }

    /**
     * @param emp_type the emp_type to set
     */
    public EmployeeType[] getEmp_type() {
        return this.emp_type;
    }

    @Override
    public String toString() {
        return "Employee Name: " + this.name + " | Employee ID: " + this.id + " | Gender: " + this.gender;
    }

}
