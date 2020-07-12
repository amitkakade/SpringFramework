/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.dependency_injection.properties_file_expression;

import java.util.Properties;

/**
 *
 * @author amit
 */
public class Drivers {

    private String driver;
    private String url;
    private String username;
    private String password;

    /**
     * @param driver the driver to set
     */
    public void setDriver(String driver) {
        this.driver = driver;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Driver Name:" + this.driver + " | URL:" + this.url + " | Username:" + this.username + " | Password:" + this.password;
    }

}
