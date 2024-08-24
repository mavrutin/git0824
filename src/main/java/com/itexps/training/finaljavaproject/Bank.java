/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.finaljavaproject;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class Bank {
    private String bank_id;
    private String bank_name;
    private String bank_address;
    private String bank_phone;
    
    private ArrayList<BusinessCustomer> buss_custList = new ArrayList<BusinessCustomer>();
    private ArrayList<IndividCustomer> indi_custList = new ArrayList<IndividCustomer>();
    private ArrayList<CheckingAccount> ch_acctList = new ArrayList<CheckingAccount>();
    private ArrayList<SavingAccount> sv_acctList = new ArrayList<SavingAccount>();
    private ArrayList<MoneyMarketAccount> mm_acctList = new ArrayList<MoneyMarketAccount>();
    private ArrayList<BusinessAccount> bus_acctList = new ArrayList<BusinessAccount>();
    private ArrayList<Branch> bank_branch = new ArrayList<Branch>();
    private ArrayList<Employee> employees = new ArrayList<Employee>(); 
    
    //Add new Bank
        public void addBankDetails() {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("*** Add Bank Info ***");
        
        System.out.println("Enter Bank ID:");
        this.bank_id= sc1.nextLine();
        
        System.out.println("Enter Bank Name:");
        this.bank_name= sc1.nextLine();
        
        System.out.println("Enter Bank Address:");
        this.bank_address = sc1.nextLine();
        
        System.out.println("Enter Bank Phone:");
        this.bank_phone = sc1.nextLine();
        }
    
    //Update existing Bank
         public void editBankDetails() {

        int ch = 0;
        Scanner sc2 = new Scanner(System.in);
        

        while (ch >= 0 && ch < 3) {
            System.out.println("************************************");
            System.out.println("***  Choose from the below menu  ***");
            System.out.println("************************************");
            System.out.println();
            System.out.println("1. Change Bank Address");
            System.out.println("2. Change Bank Phone");
            System.out.println("3. Exit Menu");
            
            Scanner sc3 = new Scanner(System.in);
            ch = sc2.nextInt();
            
            switch (ch) {
                case 1: //Change address
                    System.out.println("Enter New Bank Address");
                    this.bank_address = sc3.nextLine();
                    break;
                case 2://Change phone
                    System.out.println("Enter New Bank Phone");
                    this.bank_phone = sc3.nextLine();
                    break;
                case 3: //Exit
                    break;
            } // end of a Switch

        } // end of while loop

    }// end of Update Bank

    public Bank() {
    }
         
         
    @Override
    public String toString() {
        return  "ID: " + bank_id
                + "| Bank: " + bank_name 
                + "| Address: " + bank_address 
                + "| Phone: " + bank_phone 
                + "| Branch: "  + bank_branch 
                + "| Employees: " + employees
                + "| Business Customers: " + buss_custList 
                + "| Individual Customers: " + indi_custList 
                + "| Checking Account: " + ch_acctList
                + "| Saving Account: " + sv_acctList
                + "| MoneyMarket: " + mm_acctList
                + "| Business Account: " + bus_acctList
                + "\n";
    }

    public String getBank_id() {
        return bank_id;
    }

    public void setBank_id(String bank_id) {
        this.bank_id = bank_id;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getBank_address() {
        return bank_address;
    }

    public void setBank_address(String bank_address) {
        this.bank_address = bank_address;
    }

    public String getBank_phone() {
        return bank_phone;
    }

    public void setBank_phone(String bank_phone) {
        this.bank_phone = bank_phone;
    }

    public ArrayList<BusinessCustomer> getBuss_custList() {
        return buss_custList;
    }

    public void setBuss_custList(ArrayList<BusinessCustomer> buss_custList) {
        this.buss_custList = buss_custList;
    }

    public ArrayList<IndividCustomer> getIndi_custList() {
        return indi_custList;
    }

    public void setIndi_custList(ArrayList<IndividCustomer> indi_custList) {
        this.indi_custList = indi_custList;
    }

    public ArrayList<CheckingAccount> getCh_acctList() {
        return ch_acctList;
    }

    public void setCh_acctList(ArrayList<CheckingAccount> ch_acctList) {
        this.ch_acctList = ch_acctList;
    }

    public ArrayList<SavingAccount> getSv_acctList() {
        return sv_acctList;
    }

    public void setSv_acctList(ArrayList<SavingAccount> sv_acctList) {
        this.sv_acctList = sv_acctList;
    }

    public ArrayList<MoneyMarketAccount> getMm_acctList() {
        return mm_acctList;
    }

    public void setMm_acctList(ArrayList<MoneyMarketAccount> mm_acctList) {
        this.mm_acctList = mm_acctList;
    }

    public ArrayList<BusinessAccount> getBus_acctList() {
        return bus_acctList;
    }

    public void setBus_acctList(ArrayList<BusinessAccount> bus_acctList) {
        this.bus_acctList = bus_acctList;
    }

    public ArrayList<Branch> getBank_branch() {
        return bank_branch;
    }

    public void setBank_branch(ArrayList<Branch> bank_branch) {
        this.bank_branch = bank_branch;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

   
     
   
        
}
