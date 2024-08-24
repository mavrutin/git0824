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
public class CheckingAccount extends Account {
    private int ca_balance;

    @Override
    public void addBankAccount(int cust_ID) {

        super.addBankAccount(cust_ID);
        super.setAccount_type("CA");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Balance:");
        this.ca_balance = sc1.nextInt();
    }

    @Override
    public String toString() {
        return "CheckingAccount -->  Account No.:  " + this.getAccount_no() 
                + "| Customer ID: " + this.getAssociated_customer_ID() 
                + "| Balance: " + ca_balance 
                + "\n";
    }

    public CheckingAccount(int ca_balance, String account_no, String account_type, int associated_customer_ID) {
        super(account_no, account_type, associated_customer_ID);
        this.ca_balance = ca_balance;
    }

    public int getCa_balance() {
        return ca_balance;
    }

    public void setCa_balance(int ca_balance) {
        this.ca_balance = ca_balance;
    }

}
