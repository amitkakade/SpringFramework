/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.driver.replace_method_tag;

/**
 *
 * @author amit
 */
public class Bank {
    
    private String withdraw;
    private String deposit;
    private String balance;

    /**
     * @param withdraw the withdraw to set
     */
    public void setWithdraw(String withdraw) {
        this.withdraw = withdraw;
    }

    /**
     * @param deposit the deposit to set
     */
    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }
    
    public String withdraw(){
        return this.withdraw;
    }
    
    public String deposit(){
        return this.deposit;
    }
    
    public String balance(){
        return this.balance;
    }
    
}
