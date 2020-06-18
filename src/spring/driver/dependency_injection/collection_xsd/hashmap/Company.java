/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.collection_xsd.hashmap;

import java.util.HashMap;

/**
 *
 * @author amit
 */
public class Company {

    private HashMap<String,String> company_names;

    /**
     * @return the company_names
     */
    public HashMap<String,String> getCompany_names() {
        return company_names;
    }

    /**
     * @param company_names the company_names to set
     */
    public void setCompany_names(HashMap<String,String> company_names) {
        this.company_names = company_names;
    }

}
