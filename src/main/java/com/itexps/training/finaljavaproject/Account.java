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
public class Account {
    private String account_no;
    private String account_type; //CA-checking;SA-saving;MMA-Money Market;BA-business
    private int associated_customer_ID;
    
        public void addBankAccount(int cust_ID){
        
       // System.out.println("inside account");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter account number :");
        this.account_no = sc1.nextLine();
        this.associated_customer_ID = cust_ID;
             
    }

    @Override
    public String toString() {
        return "Account_no: " + account_no 
                + "| account_type: " + account_type 
                + "| associated_customer_ID " + associated_customer_ID;
    }

    public Account(String account_no, String account_type, int associated_customer_ID) {
        this.account_no = account_no;
        this.account_type = account_type;
        this.associated_customer_ID = associated_customer_ID;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public int getAssociated_customer_ID() {
        return associated_customer_ID;
    }

    public void setAssociated_customer_ID(int associated_customer_ID) {
        this.associated_customer_ID = associated_customer_ID;
    }

    
    
}
