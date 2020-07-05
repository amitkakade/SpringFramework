/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.life_cycle_implementation.programmming_approach;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author amit
 */
public class DriverJDBCDao {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/spring/driver/life_cycle_implementation/programmming_approach/configuration.xml");
        JDBCDaoClass obj = (JDBCDaoClass) context.getBean("jdbcdaoclass");
        boolean keep_running = true;
        while (keep_running) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter 1-> For save 2-> To close the application");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter id");
                int id = sc.nextInt();
                System.out.println("Enter name");
                String name = sc.next();
                System.out.println("Enter email");
                String email = sc.next();
                System.out.println("Enter address");
                String address = sc.next();
                try {
                    obj.save(id, name, email, address);
                } catch (SQLException ex) {
                    Logger.getLogger(DriverJDBCDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                context.close(); // This line is responsible to execute destroy() method of life-cycle management.
                keep_running = false;
            }
        }

    }
}
