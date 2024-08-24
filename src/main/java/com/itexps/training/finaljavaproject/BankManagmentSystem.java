/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.finaljavaproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 *
 * THIS IS THE DRIVER
 */
public class BankManagmentSystem {

    public static void main(String[] args) {
        Bank MyBank = new Bank();
        int menu;

        Scanner sc = new Scanner(System.in);

        //Loop though until Menu = 24 EXIT BANKING
        do {
            //Method with Menu options
            programtitle();

            System.out.println("Please select a MENU number to continue");
            menu = sc.nextInt();

            //Execute Menu choice
            switch (menu) {
                case 1: //Add branch
                    Scanner sc1 = new Scanner(System.in);
                    
                    System.out.println("Enter Branch ID");
                    int id = sc1.nextInt();
                    sc1.nextLine();
                    
                    System.out.println("Enter Branch Address");
                    String address = sc1.nextLine();
                    
                    System.out.println("Enter Contact Name");
                    String contact = sc1.nextLine();
//                    sc1.nextLine();
                            
                    System.out.println("Enter phone");
                    String phone = sc1.next();
                    
                    Branch brnch = null;
                    
                    brnch = new Branch(id, contact, address, phone);
                    
                    MyBank.getBank_branch().add(brnch);
                    MyBank.getBank_branch();
                    break;

                case 2: //Update branch
                    System.out.println("Update Branch");
                    break;

                case 3: //Delete branch
                    System.out.println("Enter Employee ID to Delete");
                    Scanner sc3 = new Scanner(System.in);
                    
                    int br_id = sc3.nextInt();
                    for (Branch bd : MyBank.getBank_branch()) {
                        if (bd.getBranch_id() == br_id) {
//                            bd.remove(br_id);
                         }
                     }
                    break;

                case 4: //View All branch
                    String currentLine4;
                    System.out.println("Write to / Read from BranchList file");

                    try {
                        //System.out.println("inside try block - file writer");
                        FileWriter fw = new FileWriter("BranchList.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        for (Branch my_branch : MyBank.getBank_branch()) {
                            bw.append(my_branch.toString());
                        }
                        bw.flush();
                        fw.flush();

                        //System.out.println("inside try block - file reader");
                        FileReader fr = new FileReader("BranchList.txt");
                        BufferedReader br = new BufferedReader(fr);
                        currentLine4 = br.readLine();
                        while (currentLine4 != null) {
                            System.out.println(currentLine4);
                            currentLine4 = br.readLine();
                        }

                        bw.flush();
                        fw.flush();

                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;

                case 5: //Search by branch ID
                    Scanner sc5 = new Scanner (System.in);
                    
                    System.out.println("Enter Branch ID to Search");
                    
                    int bid = sc5.nextInt();
                    boolean found5 = false;
                    
                    for (Branch b : MyBank.getBank_branch()) {
                        if (b.getBranch_id() == bid) {
                            System.out.println(b);
                            found5 = true;
                            break;
                        }
                    }
                    if (found5 == false) {
                        System.out.println("Branch ID does not exit");
                    }
                    break;
                    
                case 6: //Add Customer
                    BusinessCustomer bcust = new BusinessCustomer();
                    IndividCustomer icust = new IndividCustomer();

                    CheckingAccount chk_acct = new CheckingAccount(0, "", "", 0);
                    SavingAccount sav_acct = new SavingAccount(0, "", "", 0);
                    MoneyMarketAccount mm_acct = new MoneyMarketAccount(0, "", "", 0);
                    BusinessAccount bus_acct = new BusinessAccount(0, "", "", 0);

                    Scanner sc6 = new Scanner(System.in);
                    int custtype;

                    System.out.println("*** Enter 1 for INDIVIDUAL CUSTOMER and 2 for BUSINESS CUSTOMER ***");
                    custtype = sc6.nextInt();

                    if (custtype == 2) {

                        bcust.addBankCustomer(); //Add Business customer and its accounts to bcust object

                        // Adding data to different objects of Account
                        chk_acct = bcust.getChk_acct();
                        sav_acct = bcust.getSav_acct();
                        mm_acct = bcust.getMm_acct();
                        bus_acct = bcust.getBus_acct();

                        // Adding Business info to ArrayList
                        MyBank.getBuss_custList().add(bcust);

                        if (chk_acct.getAssociated_customer_ID() != 0) {
                            MyBank.getCh_acctList().add(chk_acct);
                        }
                        if (sav_acct.getAssociated_customer_ID() != 0) {
                            MyBank.getSv_acctList().add(sav_acct);
                        }
                        if (mm_acct.getAssociated_customer_ID() != 0) {
                            MyBank.getMm_acctList().add(mm_acct);
                        }
                        if (bus_acct.getAssociated_customer_ID() != 0) {
                            MyBank.getBus_acctList().add(bus_acct);
                        }

                    } else {

                        icust.addBankCustomer(); //Add Individual customer and its accounts to icust object

                        // Adding Individual info of Account
                        chk_acct = icust.getChk_acct();
                        sav_acct = icust.getSav_acct();
                        mm_acct = icust.getMm_acct();
                        bus_acct = icust.getBus_acct();

                        // Adding all individual objects to ArrayList
                        MyBank.getIndi_custList().add(icust);

                        if (chk_acct.getAssociated_customer_ID() != 0) {
                            MyBank.getCh_acctList().add(chk_acct);
                        }
                        if (sav_acct.getAssociated_customer_ID() != 0) {
                            MyBank.getSv_acctList().add(sav_acct);
                        }
                        if (mm_acct.getAssociated_customer_ID() != 0) {
                            MyBank.getMm_acctList().add(mm_acct);
                        }
                        if (bus_acct.getAssociated_customer_ID() != 0) {
                            MyBank.getBus_acctList().add(bus_acct);
                        }

                    }
                    break;

                case 7: //Update Customer
                    Scanner sc7 = new Scanner(System.in);
                    int cust_search_ID,
                     datafound = 0,
                     cust_found = 0,
                     ch_acct_info,
                     sv_acct_info,
                     mm_acct_info,
                     bus_acct_info;

                    CheckingAccount chk_acct1;
                    SavingAccount sav_acct1;
                    MoneyMarketAccount mm_acct1;
                    BusinessAccount bus_acct1;

                    System.out.print("Enter the Customer ID to update:");
                    cust_search_ID = sc7.nextInt();
                    sc7.nextLine();

                    for (BusinessCustomer buss_cust : MyBank.getBuss_custList()) { //Directly updating data in the Business Customer Array List
                        if (cust_search_ID == buss_cust.getCust_id()) {

                            ch_acct_info = buss_cust.getChk_acct().getCa_balance();
                            sv_acct_info = buss_cust.getSav_acct().getSa_balance();
                            mm_acct_info = buss_cust.getMm_acct().getMma_balance();
                            bus_acct_info = buss_cust.getBus_acct().getBa_balance();

                            buss_cust = buss_cust.editBankCustomer(buss_cust);
                            cust_found = 1;

                            //Getting Account info from Business Customer
                            chk_acct1 = buss_cust.getChk_acct();
                            System.out.println(chk_acct1.toString());

                            sav_acct1 = buss_cust.getSav_acct();
                            System.out.println(sav_acct1.toString());

                            mm_acct1 = buss_cust.getMm_acct();
                            System.out.println(mm_acct1.toString());

                            bus_acct1 = buss_cust.getBus_acct();
                            System.out.println(bus_acct1.toString());

                            //Adding Account info from Business Customer
                            if (ch_acct_info == 0 && chk_acct1.getCa_balance() != 0) {
                                MyBank.getCh_acctList().add(chk_acct1);
                            }
                            if (sv_acct_info == 0 && sav_acct1.getSa_balance() != 0) {
                                MyBank.getSv_acctList().add(sav_acct1);
                            }
                            if (mm_acct_info == 0 && mm_acct1.getMma_balance() != 0) {
                                MyBank.getMm_acctList().add(mm_acct1);
                            }
                            if (bus_acct_info == 0 && bus_acct1.getBa_balance() != 0) {
                                MyBank.getBus_acctList().add(bus_acct1);
                            }
                        }
                    }
                    if (cust_found == 0) {
                        for (IndividCustomer indi_cust : MyBank.getIndi_custList()) {
                            if (cust_search_ID == indi_cust.getCust_id()) {

                                ch_acct_info = indi_cust.getChk_acct().getCa_balance();
                                sv_acct_info = indi_cust.getSav_acct().getSa_balance();
                                mm_acct_info = indi_cust.getMm_acct().getMma_balance();
                                bus_acct_info = indi_cust.getBus_acct().getBa_balance();

                                indi_cust = indi_cust.editBankCustomer(indi_cust);
                                cust_found = 1;

                                //Getting account info from Individual Customer
                                chk_acct1 = indi_cust.getChk_acct();
                                System.out.println(chk_acct1.toString());

                                sav_acct1 = indi_cust.getSav_acct();
                                System.out.println(sav_acct1.toString());

                                mm_acct1 = indi_cust.getMm_acct();
                                System.out.println(mm_acct1.toString());

                                bus_acct1 = indi_cust.getBus_acct();
                                System.out.println(bus_acct1.toString());

                                //Adding Account info from Individual Customer
                                if (ch_acct_info == 0 && chk_acct1.getCa_balance() != 0) {
                                    MyBank.getCh_acctList().add(chk_acct1);
                                }
                                if (sv_acct_info == 0 && sav_acct1.getSa_balance() != 0) {
                                    MyBank.getSv_acctList().add(sav_acct1);
                                }
                                if (mm_acct_info == 0 && mm_acct1.getMma_balance() != 0) {
                                    MyBank.getMm_acctList().add(mm_acct1);
                                }
                                if (bus_acct_info == 0 && bus_acct1.getBa_balance() != 0) {
                                    MyBank.getBus_acctList().add(bus_acct1);
                                }
                            }
                        }
                    }
                    if (cust_found == 0) {
                        System.out.println("Customer ID does not exists! Try Again ");
                    }
                    break;

                case 8: //Delete Customer
                    Scanner sc8 = new Scanner(System.in);
                    int delete_ID2;
                    boolean found8 = false;

                    System.out.print("Enter the Customer ID you want to DELETE: ");
                    delete_ID2 = sc8.nextInt();
//                    sc8.nextLine();

                    //Delete Business Customer
                    for (BusinessCustomer bus_cust : MyBank.getBuss_custList()) {
                        if (bus_cust.getCust_id() == delete_ID2) {
                            MyBank.getBuss_custList().remove(delete_ID2);
                            found8 = true;
                            break;
                        }
                    }
                    
                    //Delete Individual Custonmer
                    for (IndividCustomer ind_cust : MyBank.getIndi_custList()) {
                        if (ind_cust.getCust_id() == delete_ID2) {
                            MyBank.getIndi_custList().remove(delete_ID2);
                            found8 = true;
                            break;
                        }
                    }
                    
                    if (found8 == false) {
                        System.out.println("Customer ID does not exit");
                    }

                    break;

                case 9: //View All Customer
                    String currentLine9;
                    System.out.println("Write to / Read from CustomerList file");

                    try {
                        //System.out.println("inside try block - file writer");
                        FileWriter fw = new FileWriter("CustomerList.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        for (BusinessCustomer buss_cust : MyBank.getBuss_custList()) {
                            bw.append(buss_cust.toString());
                        }
                        for (IndividCustomer indi_cust : MyBank.getIndi_custList()) {
                            bw.append(indi_cust.toString());
                        }

                        bw.flush();
                        fw.flush();

                        //System.out.println("inside try block - file reader");
                        FileReader fr = new FileReader("CustomerList.txt");
                        BufferedReader br = new BufferedReader(fr);
                        currentLine9 = br.readLine();
                        while (currentLine9 != null) {
                            System.out.println(currentLine9);
                            currentLine9 = br.readLine();
                        }

                        bw.flush();
                        fw.flush();

                    } catch (Exception e) {

                        e.getMessage();

                    }
                    break;

                case 10: //Search by Customer ID
                    Scanner sc10 = new Scanner(System.in);

                    int search_ID2,
                     found10 = 0;

                    System.out.print("Enter the Customer ID you want to search: ");
                    search_ID2 = sc10.nextInt();
                    sc10.nextLine();

                    for (BusinessCustomer buss_cust : MyBank.getBuss_custList()) {
                        if (search_ID2 == buss_cust.getCust_id()) {
                            System.out.println("BUSINESS CUSTOMER:");
                            System.out.println("ID                 :" + buss_cust.getCust_id());
                            System.out.println("Name               :" + buss_cust.getCust_fname() + buss_cust.getCust_lname());
                            System.out.println("Phone              :" + buss_cust.getCust_phone());
                            System.out.println("Address            :" + buss_cust.getCust_address());
                            System.out.println("Business Name      :" + buss_cust.getBus_name());
                            System.out.println("Business Type      :" + buss_cust.getBus_type());
                            System.out.println("These are the associated accounts :");
                            if (!buss_cust.getChk_acct().getAccount_no().isEmpty()) {
                                System.out.println("Checking Account : " + buss_cust.getChk_acct().getAccount_no());
                            }
                            if (!buss_cust.getSav_acct().getAccount_no().isEmpty()) {
                                System.out.println("Saving Account   : " + buss_cust.getSav_acct().getAccount_no());
                            }
                            if (!buss_cust.getMm_acct().getAccount_no().isEmpty()) {
                                System.out.println("Saving Account   : " + buss_cust.getMm_acct().getAccount_no());
                            }
                            if (!buss_cust.getBus_acct().getAccount_no().isEmpty()) {
                                System.out.println("Business ACcount : " + buss_cust.getBus_acct().getAccount_no());
                            }
                            found10 = 1;
                        }
                    }
                    if (found10 == 0) {
                        for (IndividCustomer indi_cust : MyBank.getIndi_custList()) {
                            if (search_ID2 == indi_cust.getCust_id()) {
                                System.out.println("INDIVIDUAL CUSTOMER:");
                                System.out.println("ID                 :" + indi_cust.getCust_id());
                                System.out.println("Name               :" + indi_cust.getCust_fname() + indi_cust.getCust_lname());
                                System.out.println("Phone              :" + indi_cust.getCust_phone());
                                System.out.println("Address            :" + indi_cust.getCust_address());
                                System.out.println("Gender             :" + indi_cust.getGender());
                                System.out.println("Email              :" + indi_cust.getEmail());
                                System.out.println("These are the associated accounts :");
                                if (!indi_cust.getChk_acct().getAccount_no().isEmpty()) {
                                    System.out.println("Checking Account : " + indi_cust.getChk_acct().getAccount_no());
                                }
                                if (!indi_cust.getSav_acct().getAccount_no().isEmpty()) {
                                    System.out.println("Saving Account   : " + indi_cust.getSav_acct().getAccount_no());
                                }
                                if (!indi_cust.getMm_acct().getAccount_no().isEmpty()) {
                                    System.out.println("Saving Account   : " + indi_cust.getMm_acct().getAccount_no());
                                }
                                if (!indi_cust.getBus_acct().getAccount_no().isEmpty()) {
                                    System.out.println("Business ACcount : " + indi_cust.getBus_acct().getAccount_no());
                                }
                                found10 = 1;
                            }
                        }
                    }
                    if (found10 == 0) {
                        System.out.println("Customer ID does not exist! Try Again");
                    }

                    break;

                case 11: //Add Account
                    System.out.println("Add Account");
                    break;

                case 12: //Update Account
                    System.out.println("Update Account");
                    break;

                case 13: //Delete Account
                    System.out.println("Delete Account");
                    break;

                case 14: //View All Accounts
                    System.out.println("View All Accounts");
                    break;

                case 15: //Search by Account ID
                    System.out.println("Search by Account ID");
                    break;

                case 16: //Add Employee
                    ArrayList<Employee> employees = new ArrayList<>();
                    int choice = 0;
                    Scanner sc16 = new Scanner(System.in);
                    
                    System.out.println("Add employee");
                    System.out.println("Enter id");
                    int emp_id = sc16.nextInt();
                    System.out.println("Enter first name");
                    String first = sc16.next();
                    System.out.println("Enter last name");
                    String last = sc16.next();
                    System.out.println("Enter email");
                    String email = sc16.next();
                    System.out.println("Employee type");
                    String type = sc16.next();
                    Employee emp = null;
                    if (type.equalsIgnoreCase("fulltime")) {
                        System.out.println("Enter salary");
                        int salary = sc16.nextInt();
                        emp = new FullTimeEmployee(emp_id, first, last, email, type, salary);
                    } else {
                        System.out.println("Enter hourly rate");
                        int hourlyrate = sc16.nextInt();
                        emp = new PartTimeEmployee(emp_id, first, last, email, type, hourlyrate);
                    }

                    MyBank.getEmployees().add(emp);
                    MyBank.getEmployees();
                 
                    System.out.println(MyBank);                    
                    break;

                case 17: //Update Employee
                    System.out.println("Update Employee");
                    break;

                case 18: //Delete Employee
                    System.out.println("Enter Employee ID to Delete");
                    Scanner sc18 = new Scanner(System.in);
                    
                    int emid = sc18.nextInt();
                    for (Employee e : MyBank.getEmployees()) {
                        if (e.getId() == emid) {
                            e.remove(emid);
                         }
                     }
                    break;

                case 19: //View ALL Employees
                    String currentLine19;
                    System.out.println("Write to / Read from EmployeeList file");
                    
                    //Write to file EmployeeList.txt
                    try {
                        FileWriter fw = new FileWriter("EmployeeList.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        for (Employee emps : MyBank.getEmployees()) {

                            bw.write("Employee ID: " + emps.getId() 
                                    + ", First Name: " + emps.getFirst()
                                    + ", Last Name: " + emps.getLast()
                                    + ", eMail: " + emps.getEmail() 
                                    + ", Employee Type: " + emps.getType()+ " | Salary/Hourly Wages: $");
                            if (emps instanceof FullTimeEmployee) {
                                bw.write(((FullTimeEmployee) emps).getSalary() + "");
                            } else {
                                bw.write(((PartTimeEmployee) emps).getHourlyRate() + "");
                            }
                            bw.write("\n");
                        } 
                        
                      bw.close();
                      fw.close();
                      
                      //Read from file EmployeeList.txt;
                        FileReader fr = new FileReader("EmployeeList.txt");
                        BufferedReader br = new BufferedReader(fr);
                        currentLine19 = br.readLine();
                        while (currentLine19 != null) {
                            System.out.println(currentLine19);
                            currentLine19 = br.readLine();
                        }

                        bw.flush();
                        fw.flush();
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    break;

                case 20: //Search by Employee ID
                    Scanner sc20 = new Scanner (System.in);
                    
                    System.out.println("Enter Employee ID to Search");
                    
                    int eid = sc20.nextInt();
                    boolean found20 = false;
                    
                    for (Employee e : MyBank.getEmployees()) {
                        if (e.getId() == eid) {
                            System.out.println(e);
                            found20 = true;
                            break;
                        }
                    }
                    if (found20 == false) {
                        System.out.println("Employee ID does not exit");
                    }
                    break;

                case 21: //Add Bank Info
                    MyBank.addBankDetails();
                    break;

                case 22: //Update Bank address and phone
                    MyBank.editBankDetails();
                    break;

                case 23: //View Bank details
                    System.out.println("*** BANK DETAILS ***");
                    System.out.println("Bank Name    :" + MyBank.getBank_name());
                    System.out.println("Bank Address :" + MyBank.getBank_address());
                    System.out.println("Bank Phone   :" + MyBank.getBank_phone());
                    System.out.println("No. of Branches             : " + MyBank.getBank_branch().size());
                    System.out.println("No. of Employees            : " + MyBank.getEmployees().size());
                    System.out.println("No. of Business Customers   : " + MyBank.getBuss_custList().size());
                    System.out.println("No. of Individual Customers : " + MyBank.getIndi_custList().size());
                    System.out.println("No. of Checking Accounts    : " + MyBank.getCh_acctList().size());
                    System.out.println("No. of Savings Accounts     : " + MyBank.getSv_acctList().size());
                    System.out.println("No. of Money Market Accounts: " + MyBank.getMm_acctList().size());
                    System.out.println("No. of Business Accounts    : " + MyBank.getBus_acctList().size());
                    break;

                case 24: //Exit banking system
                    System.out.println("Thank you for using TEAM BANKING SYSTEM!");
                    System.out.println("Goodbye!");
                    System.exit(0);
                    break;

                default: // Not a valid number
                    System.out.println("Invalid choice. Try again.");
                    break;

            } // End of Switch

        } while (menu != 24); // End of DO-While loop

    } // End of Main block

    //This method holds all menues for the program
    static void programtitle() {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                                                                            WELCOME");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ TO ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("                                                                                           TEAM--BANK");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Select from the following menu~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("     BRANCH                            CUSTOMER                                 ACCOUNT                                 EMPLOYEE                             BANK INFO");
        System.out.println("     ~~~~~~                            ~~~~~~~~                                 ~~~~~~~                                 ~~~~~~~~~                            ~~~~~~~~~");
        System.out.println("1. ADD BRANCH                      6. ADD CUSTOMER                          11. ADD ACCOUNT                         16. ADD EMPLOYEE                     21. ADD BANK DETAILS");
        System.out.println("2. UPDATE BRANCH                   7. UPDATE CUSTOMER                       12. UPDATE ACCOUNT                      17. UPDATE EMPLOYEE                  22. UPDATE BANK DETAILS");
        System.out.println("3. DELETE BRANCH                   8. DELETE CUSTOMER                       13. DELETE ACCOUNT                      18. DELETE EMPLOYEE                  23. VIEW BANK DETAILS");
        System.out.println("4. VIEW ALL BRANCHES               9. VIEW ALL CUSTOMERS                    14. VIEW ALL ACCOUNTS                   19. VIEW ALL EMPLOYEES               24. EXIT BANKING");
        System.out.println("5. SEARCH BY BRANCH ID            10. SEARCH BY CUSTOMER ID                 15. SEARCH BY ACCOUNT ID                20. SEARCH BY EMPLOYEE ID ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }
}
