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
public class Branch {
    private int branch_id; 
    private String branch_contact;
    private String branch_address;
    private String branch_ph_number;

 public void addBranch() {

        Scanner sc1 = new Scanner(System.in);
        
        System.out.print("Enter Branch ID:");
        this.branch_id = sc1.nextInt();
        
        System.out.print("Enter Branch Contact Name:");
        this.branch_contact = sc1.nextLine();        
//        sc1.nextLine();

        System.out.print("Enter Branch Address:");
        this.branch_address = sc1.nextLine();
//        sc1.nextLine();
      
        System.out.print("Enter Branch Phone Number:");
        this.branch_ph_number = sc1.nextLine();
//        sc1.nextLine();
             
    }
    
    @Override
    public String toString() {
        return 
                "Branch ID: " + branch_id 
                + "| Branch Contact: " + branch_contact 
                + "| Branch Address: " + branch_address 
                + "| Branch Phon: " + branch_ph_number;
    }

    public Branch(int branch_id, String branch_contact, String branch_address, String branch_ph_number) {
        this.branch_id = branch_id;
        this.branch_contact = branch_contact;
        this.branch_address = branch_address;
        this.branch_ph_number = branch_ph_number;
    }

    public int getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(int branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_contact() {
        return branch_contact;
    }

    public void setBranch_contact(String branch_contact) {
        this.branch_contact = branch_contact;
    }

    public String getBranch_address() {
        return branch_address;
    }

    public void setBranch_address(String branch_address) {
        this.branch_address = branch_address;
    }

    public String getBranch_ph_number() {
        return branch_ph_number;
    }

    public void setBranch_ph_number(String branch_ph_number) {
        this.branch_ph_number = branch_ph_number;
    }

  
    
}
