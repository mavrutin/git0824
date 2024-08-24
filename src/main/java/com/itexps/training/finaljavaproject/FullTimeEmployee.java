/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.finaljavaproject;

/**
 *
 * @author Lenovo
 */
public class FullTimeEmployee extends Employee {
     private int  salary;

    public FullTimeEmployee( int id, String first, String last, String email, String type, int salary) {
        super(id, first, last, email, type);
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Full Time Employee { " + "Salary = " + salary + " " + super.toString() + '}';
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
}
