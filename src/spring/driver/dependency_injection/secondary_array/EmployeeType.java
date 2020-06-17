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
public class EmployeeType {

    private String emp_type;
    private String[] emp_type_achievement;

    /**
     * @param emp_type the emp_type to set
     */
    public void setEmp_type(String emp_type) {
        this.emp_type = emp_type;
    }
    
    /**
     * @param emp_type_achievement the emp_type_achievement to set
     */
    public void setEmp_type_achievement(String[] emp_type_achievement) {
        this.emp_type_achievement = emp_type_achievement;
    }
    
    /**
     * @param emp_type_achievement the emp_type_achievement to get
     */
    public String[] getEmp_type_achievement() {
        return this.emp_type_achievement;
    }
    
    @Override
    public String toString() {
        return "Employee Type: " + this.emp_type;
    }
    
}
