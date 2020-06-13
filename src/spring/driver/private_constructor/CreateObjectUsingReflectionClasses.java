/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.private_constructor;

import java.lang.reflect.Constructor;

/**
 *
 * @author amit
 */
public class CreateObjectUsingReflectionClasses {

    public static void main(String[] args) {
        //Employee e = new Employee(); // Uncomment this line to see error that private constructor access.

        /**
         * Please check following code where we are making private constructor
         * accessible to create instance UsingReflection class 'Constructor' .
         */
        try {
            Class c = Class.forName("spring.driver.private_constructor.Employee");
            Constructor[] const_arr = c.getDeclaredConstructors();
            const_arr[0].setAccessible(true); // This line make constructor accessible
            Employee e = (Employee) const_arr[0].newInstance();
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
