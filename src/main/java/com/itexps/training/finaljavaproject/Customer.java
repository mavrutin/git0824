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
public class Customer {
    private int cust_id;
    private String cust_fname;
    private String cust_lname;
    private String cust_type; //Individual (I) vs. Business (B)
    private String cust_address;
    private String cust_phone; 
    
    SavingAccount sav_acct = new SavingAccount(0,"","",0);
    CheckingAccount chk_acct = new CheckingAccount(0,"","",0);
    MoneyMarketAccount mm_acct = new MoneyMarketAccount(0,"","",0);
    BusinessAccount bus_acct = new BusinessAccount(0,"","",0);
    
        public void addBankCustomer() {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter Customer ID:");
        this.cust_id = sc1.nextInt();
        System.out.print("Enter Customer first name:");
        this.cust_fname= sc1.nextLine();
//        sc1.nextLine();
        System.out.print("Enter Customer last name:");
        this.cust_lname= sc1.nextLine();
//        sc1.nextLine();
        System.out.print("Enter Customer address:");
        this.cust_address = sc1.nextLine();
//       sc1.nextLine();
        System.out.print("Enter I for Individual or B for Business customer:");
        this.cust_type = sc1.nextLine();
//        sc1.nextLine();
        System.out.print("Enter Customer phone number:");
        this.cust_phone = sc1.nextLine();
//        sc1.nextLine();
        
        String answer;
        System.out.println("Does this customer want a CHECKING ACCOUNT ? (y/Y) or (n/N)");
        answer = sc1.nextLine();

        if (answer.equalsIgnoreCase("y")) {
            chk_acct.addBankAccount(this.cust_id);
        }

        String answer1;
        System.out.println("Does this customer want a SAVING ACCOUNT ? (y/Y) or (n/N)");
        answer1 = sc1.nextLine();

        if (answer1.equalsIgnoreCase("y")) {
            sav_acct.addBankAccount(this.cust_id);
        }
        
        String answer2;
        System.out.println("Does this customer want a MONEY MARKET ACCOUNT ? (y/Y) or (n/N)");
        answer2 = sc1.nextLine();

        if (answer2.equalsIgnoreCase("y")) {
            mm_acct.addBankAccount(this.cust_id);
        }
        
        String answer3;
        System.out.println("Does this customer want a BUSINESS ACCOUNT ? (y/Y) or (n/N)");
        answer3 = sc1.nextLine();

        if (answer3.equalsIgnoreCase("y")) {
           bus_acct.addBankAccount(this.cust_id);
        }
    }

  @Override
    public String toString() {
        return "Customer ID =" + cust_id 
                + "| Name = " + cust_fname + " "  + cust_lname 
                + "| type = " + cust_type
                + "| address = " + cust_address 
                + "| phone = " + cust_phone 
                + "| chk_acct = " + chk_acct 
                + "| sav_acct = " + sav_acct 
                + "| moneymarket_acct = " + mm_acct 
                + "| bus_acct = " + bus_acct;
    }

    public int getCust_id() {
        return cust_id;
    }

    public void setCust_id(int cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_fname() {
        return cust_fname;
    }

    public void setCust_fname(String cust_fname) {
        this.cust_fname = cust_fname;
    }

    public String getCust_lname() {
        return cust_lname;
    }

    public void setCust_lname(String cust_lname) {
        this.cust_lname = cust_lname;
    }

    public String getCust_type() {
        return cust_type;
    }

    public void setCust_type(String cust_type) {
        this.cust_type = cust_type;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address;
    }

    public String getCust_phone() {
        return cust_phone;
    }

    public void setCust_phone(String cust_phone) {
        this.cust_phone = cust_phone;
    }

    public SavingAccount getSav_acct() {
        return sav_acct;
    }

    public void setSav_acct(SavingAccount sav_acct) {
        this.sav_acct = sav_acct;
    }

    public CheckingAccount getChk_acct() {
        return chk_acct;
    }

    public void setChk_acct(CheckingAccount chk_acct) {
        this.chk_acct = chk_acct;
    }

    public MoneyMarketAccount getMm_acct() {
        return mm_acct;
    }

    public void setMm_acct(MoneyMarketAccount mm_acct) {
        this.mm_acct = mm_acct;
    }

    public BusinessAccount getBus_acct() {
        return bus_acct;
    }

    public void setBus_acct(BusinessAccount bus_acct) {
        this.bus_acct = bus_acct;
    }
       
        
        
}
