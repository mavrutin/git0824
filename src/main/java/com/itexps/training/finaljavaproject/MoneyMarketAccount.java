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
public class MoneyMarketAccount extends Account{
        private int mma_balance;

    @Override
    public void addBankAccount(int cust_ID) {

        super.addBankAccount(cust_ID);
        super.setAccount_type("MMA");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Balance:");
        this.mma_balance = sc1.nextInt();
    }

    @Override
    public String toString() {
          return "MoneyMarketAccount -->  Account No.:  " + this.getAccount_no() 
                  + "| Customer ID: " + this.getAssociated_customer_ID() 
                  + "| Balance: " + mma_balance + "\n";
    }

    public MoneyMarketAccount(int mma_balance, String account_no, String account_type, int associated_customer_ID) {
        super(account_no, account_type, associated_customer_ID);
        this.mma_balance = mma_balance;
    }

    public int getMma_balance() {
        return mma_balance;
    }

    public void setMma_balance(int mma_balance) {
        this.mma_balance = mma_balance;
    }
    
    
}
