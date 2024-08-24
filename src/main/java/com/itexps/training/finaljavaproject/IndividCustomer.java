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
public class IndividCustomer extends Customer {

    private String email;
    private String gender;

    @Override
    public void addBankCustomer() //Add new individual customer
    {

        super.addBankCustomer();
        super.setCust_type("I");
        Scanner sc3 = new Scanner(System.in);

        System.out.print("Enter Gender:");
        this.gender = sc3.nextLine();
        sc3.nextLine();
        System.out.print("Enter eMail:");
        this.email = sc3.nextLine();
        sc3.nextLine();
    }
    public IndividCustomer editBankCustomer(IndividCustomer indi_cust)//update customer
    {
        Scanner sc1 = new Scanner(System.in);
        String new_fname, new_lname, new_phone, new_address, new_gender, new_email;
                
        System.out.print("Enter new First Name: ");
        new_fname= sc1.nextLine();
        indi_cust.setCust_fname(new_fname);
        
        System.out.print("Enter new Last Name: ");
        new_lname= sc1.nextLine();
        indi_cust.setCust_lname(new_lname);
        
        System.out.print("Enter new Phone Number: ");
        new_phone = sc1.nextLine();
        indi_cust.setCust_phone(new_phone);
        
        System.out.print("Enter new Address: ");
        new_address = sc1.nextLine();
        indi_cust.setCust_address(new_address);
        
        System.out.print("Enter Gender:");
        new_gender = sc1.nextLine();
        indi_cust.setGender (new_gender);
                
        System.out.print("Enter eMail:");
        new_email = sc1.nextLine();
        indi_cust.setEmail (new_email);
        
        String answer; // checking account
        if (indi_cust.getChk_acct().getAssociated_customer_ID() == 0) {
            System.out.println("Does this customer want a CHECKING ACCOUNT? (y/Y) or (n/N)");
            answer = sc1.nextLine();

            if (answer.equalsIgnoreCase("y")) {
                this.chk_acct.addBankAccount(indi_cust.getCust_id());
            }
        }

        String answer1; // saving account
        if (indi_cust.getSav_acct().getAssociated_customer_ID() == 0) {
            System.out.println("Does this customer want a SAVING ACCOUNT? (y/Y) or (n/N)");
            answer1 = sc1.nextLine();

            if (answer1.equalsIgnoreCase("y")) {
                this.sav_acct.addBankAccount(indi_cust.getCust_id());
            }
        }

        String answer2; // money market account
        if (indi_cust.getMm_acct().getAssociated_customer_ID() == 0) {
            System.out.println("Does this customer want a MONEY MARKET ACCOUNT? (y/Y) or (n/N)");
            answer2 = sc1.nextLine();

            if (answer2.equalsIgnoreCase("y")) {
                this.mm_acct.addBankAccount(indi_cust.getCust_id());
            }
        }
                
        String answer3; //business account
        if (indi_cust.getBus_acct().getAssociated_customer_ID() == 0) {
            System.out.println("Does this customer want a BUSINESS ACCOUNT? (y/Y) or (n/N)");
            answer3 = sc1.nextLine();

            if (answer3.equalsIgnoreCase("y")) {
                this.bus_acct.addBankAccount(indi_cust.getCust_id());
            }
        }
        
        return indi_cust;
    }

  @Override
    public String toString() {
        return "Individual Customer -> Customer ID:  "  + this.getCust_id() 
                + "| Name:  " + this.getCust_fname() + this.getCust_lname()                
                + "| Phone: " + this.getCust_phone() 
                + "| Address: "  + this.getCust_address() 
                + "| Gender: " + this.getGender()
                + "| Email: " + this.getEmail()
                + "\n";
    }
        
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
