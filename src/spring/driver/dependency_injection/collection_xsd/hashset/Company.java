/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.collection_xsd.hashset;

import java.util.HashSet;

/**
 *
 * @author amit
 */
public class Company {

    private HashSet<String> company_names;

    /**
     * @return the company_names
     */
    public HashSet<String> getCompany_names() {
        return company_names;
    }

    /**
     * @param company_names the company_names to set
     */
    public void setCompany_names(HashSet<String> company_names) {
        this.company_names = company_names;
    }

}
