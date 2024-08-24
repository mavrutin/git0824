/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.finaljavaproject;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class BusinessAccount extends Account{
    
     private int ba_balance;

    @Override
    public void addBankAccount(int cust_ID){
        
        super.addBankAccount(cust_ID);
        super.setAccount_type("BA");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter balance:");
        this.ba_balance = sc1.nextInt();
    }

    public BusinessAccount(int ba_balance, String account_no, String account_type, int associated_customer_ID) {
        super(account_no, account_type, associated_customer_ID);
        this.ba_balance = ba_balance;
    }

    @Override
    public String toString() {
        return "Business Account -->  Account :" + this.getAccount_no() 
                + "| Customer No:" + this.getAssociated_customer_ID() 
                + "| Balance:" + ba_balance 
                + "\n";
    }

    public int getBa_balance() {
        return ba_balance;
    }

    public void setBa_balance(int ba_balance) {
        this.ba_balance = ba_balance;
    }
    
}
