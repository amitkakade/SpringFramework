/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.j2ee_stero_type_named;

import javax.annotation.Resource;
import javax.inject.Named;

/**
 *
 * @author amit
 */
@Named
public class Employee_Parent {


    @Resource
    private Company_Child company;
    
    /**
     * @param company the company to set
     */
    public void setCompany(Company_Child company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Company Name: "+this.company.getName();
    }
    
}
