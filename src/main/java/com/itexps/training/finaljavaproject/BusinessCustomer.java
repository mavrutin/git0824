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
public class BusinessCustomer extends Customer{
    
    private String bus_name;
    private String bus_type;

    @Override
    //Add Business customer
    public void addBankCustomer() {

        super.addBankCustomer();
        super.setCust_type("B");
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter Business Name:");
        this.bus_type = sc2.nextLine();
//        sc2.nextLine();
        
        System.out.print("Enter Business Type:");
        this.bus_type = sc2.nextLine();
//        sc2.nextLine();
    }
    //Update Business customer
    public BusinessCustomer editBankCustomer(BusinessCustomer buss_cust) {

        Scanner sc1 = new Scanner(System.in);
        String new_fname, new_lname, new_phone, new_address, new_bus_name, new_bus_type;
        
        System.out.print("Enter new First Name: ");
        new_fname = sc1.nextLine();
//        sc1.nextLine();
        buss_cust.setCust_fname(new_fname);
        
        System.out.print("Enter new Lsst Name: ");
        new_lname = sc1.nextLine();
//        sc1.nextLine();
        buss_cust.setCust_lname(new_lname);
        
        System.out.print("Enter new Phone Number: ");
        new_phone = sc1.nextLine();
//        sc1.nextLine();
        buss_cust.setCust_phone(new_phone);
        
        System.out.print("Enter new Address: ");
        new_address = sc1.nextLine();
//        sc1.nextLine();
        buss_cust.setCust_address(new_address);
        
        System.out.print("Enter new Name of Business: ");
        new_bus_name = sc1.nextLine();
        sc1.nextLine();
        buss_cust.setBus_name(new_bus_name);
        
        System.out.print("Enter new Type of Business: ");
        new_bus_type = sc1.nextLine();
//        sc1.nextLine();
        buss_cust.setBus_type(new_bus_type);

        //checking account
        String answer; 
        if (buss_cust.getChk_acct().getAssociated_customer_ID() == 0) {
            System.out.println("Does this customer want a CHECKING ACCOUNT? (y/Y) or (n/N)");
            answer = sc1.nextLine();
//            sc1.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                this.chk_acct.addBankAccount(buss_cust.getCust_id());
            }
        }
        // saving account
        String answer1; 
        if (buss_cust.getSav_acct().getAssociated_customer_ID() == 0) {
            System.out.println("Does this customer want a SAVING ACCOUNT? (y/Y) or (n/N)");
            answer1 = sc1.nextLine();
//            sc1.nextLine();

            if (answer1.equalsIgnoreCase("y")) {
                this.sav_acct.addBankAccount(buss_cust.getCust_id());
            }
        }
        // money market account
        String answer2; 
        if (buss_cust.getMm_acct().getAssociated_customer_ID() == 0) {
            System.out.println("Does this customer want a MONEY MARKET ACCOUNT? (y/Y) or (n/N)");
            answer2 = sc1.nextLine();
//            sc1.nextLine();

            if (answer2.equalsIgnoreCase("y")) {
                this.mm_acct.addBankAccount(buss_cust.getCust_id());
            }
        }
         //business account
        String answer3;
        if (buss_cust.getBus_acct().getAssociated_customer_ID() == 0) {
            System.out.println("Does this customer want a Business ACCOUNT? (y/Y) or (n/N)");
            answer3 = sc1.nextLine();
//            sc1.nextLine();

            if (answer3.equalsIgnoreCase("y")) {
                this.bus_acct.addBankAccount(buss_cust.getCust_id());
            }
        }
        return buss_cust;
    }

     @Override
    public String toString() {
        return "Individual Customer -> Customer ID:  "  + this.getCust_id() 
                + "| Name:  " + this.getCust_fname() + this.getCust_lname()                
                + "| Phone: " + this.getCust_phone() 
                + "| Address: "  + this.getCust_address() 
                + "| Business Name: " + this.getBus_name()
                + "| Business Type: " + this.getBus_type()
                + "\n";
    }
        
    
    public String getBus_name() {
        return bus_name;
    }

    public void setBus_name(String bus_name) {
        this.bus_name = bus_name;
    }

    public String getBus_type() {
        return bus_type;
    }

    public void setBus_type(String bus_type) {
        this.bus_type = bus_type;
    }
    
    
    
}
