/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.replace_method_tag;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

/**
 *
 * @author amit
 */
public class BankImplement implements MethodReplacer {
    
    private String balance;

    /**
     * @param balance the balance to set
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }


    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        return this.balance;
    }

}
