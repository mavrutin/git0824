/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itexps.training.finaljavaproject;

/**
 *
 * @author Lenovo
 */
public class Employee {
    private int id;
    private String first;
    private String last;
    private String email;
    private String type;
    
    public Employee(int id, String first, String last, String email, String type) {
        this.id = id;
        this.first = first;
        this.last = last;
        this.email = email;
        this.type = type;
    }

        
    @Override
    public String toString() {
        return "Employee { " + "ID = " + id + ", First Name = " + first + ", Last Name = " + last + ", Email = " + email + ", Employee Type = " + type + '}';
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void remove(int emid) {
        this.remove(emid);
    }
  
}

    
