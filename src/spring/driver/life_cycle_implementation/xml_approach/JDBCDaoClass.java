/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.life_cycle_implementation.xml_approach;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author amit
 */
public class JDBCDaoClass {

    private String driver;
    private String url;
    private String username;
    private String password;
    Connection con;

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

    public void myInit() throws Exception {
        Class.forName(this.driver);
        con = (Connection) DriverManager.getConnection(url, username, password);
        System.out.println("Connection opened successfully....");
    }

    public void myDestroy() throws Exception {
        con.close();
        System.out.println("Connection closed successfully....");
    }

    public void save(int id, String name, String email, String address) throws SQLException {
        PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, email);
        ps.setString(4, address);
        ps.executeUpdate();
        System.out.println("Data saved successfully....");
    }

}
