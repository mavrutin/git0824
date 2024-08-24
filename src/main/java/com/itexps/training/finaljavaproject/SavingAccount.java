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
public class SavingAccount extends Account {
       private int sa_balance;

    
    @Override
    public void addBankAccount(int cust_ID){
        
        super.addBankAccount(cust_ID);
        super.setAccount_type("SA");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter balance:");
        this.sa_balance = sc1.nextInt();
    }
           
    @Override
    public String toString() {
       return "SavingsAccount -->  Account No : " + this.getAccount_no() 
               + "| Customer ID : "+ this.getAssociated_customer_ID() 
               + "| Balance: " + sa_balance + "\n";
    }

    public SavingAccount(int sa_balance, String account_no, String account_type, int associated_customer_ID) {
        super(account_no, account_type, associated_customer_ID);
        this.sa_balance = sa_balance;
    }

    public int getSa_balance() {
        return sa_balance;
    }

    public void setSa_balance(int sa_balance) {
        this.sa_balance = sa_balance;
    }
    
       
}
