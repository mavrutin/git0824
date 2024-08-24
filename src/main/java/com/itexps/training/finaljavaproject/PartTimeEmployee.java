/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.finaljavaproject;

/**
 *
 * @author Lenovo
 */
public class PartTimeEmployee extends Employee {
    private int hourlyRate ;

    public PartTimeEmployee(int id, String first, String last, String email, String type, int hourlyRate) {
        super(id, first, last, email, type);
        this.hourlyRate = hourlyRate;
    }
  
    @Override
    public String toString() {
        return "Part Time Employee { " + "Hourly Rate = " + hourlyRate + " " + super.toString() + '}';
    }
        
    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    
}
