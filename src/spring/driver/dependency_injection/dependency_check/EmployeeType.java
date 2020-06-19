/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.dependency_check;

import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author amit
 */
public class EmployeeType {

    private String emp_type;

    /**
     * @param emp_type the emp_type to set
     */
    public void setEmp_type(String emp_type) {
        this.emp_type = emp_type;
    }

    @Override
    public String toString() {
        return "Employee Type: " + this.emp_type;
    }

}
