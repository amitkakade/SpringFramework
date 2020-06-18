/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.collection_dtd;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author amit
 */
public class Company {

    private List<String> company_names;
    private Set<String> top_employees;
    private Map<String, String> company_employee;

    /**
     * @return the company_names
     */
    public List<String> getCompany_names() {
        return company_names;
    }

    /**
     * @param company_names the company_names to set
     */
    public void setCompany_names(List<String> company_names) {
        this.company_names = company_names;
    }

    /**
     * @return the top_employees
     */
    public Set<String> getTop_employees() {
        return top_employees;
    }

    /**
     * @param top_employees the top_employees to set
     */
    public void setTop_employees(Set<String> top_employees) {
        this.top_employees = top_employees;
    }

    /**
     * @return the company_employee
     */
    public Map<String, String> getCompany_employee() {
        return company_employee;
    }

    /**
     * @param company_employee the company_employee to set
     */
    public void setCompany_employee(Map<String, String> company_employee) {
        this.company_employee = company_employee;
    }

}
