/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.collection_xsd.vector;

import java.util.Vector;

/**
 *
 * @author amit
 */
public class Company {

    private Vector<String> company_names;

    /**
     * @return the company_names
     */
    public Vector<String> getCompany_names() {
        return company_names;
    }

    /**
     * @param company_names the company_names to set
     */
    public void setCompany_names(Vector<String> company_names) {
        this.company_names = company_names;
    }

}
