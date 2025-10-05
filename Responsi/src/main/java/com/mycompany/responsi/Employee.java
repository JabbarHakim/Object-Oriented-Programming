/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsi;

/**
 *
 * @author ER-HA
 */
public class Employee {
    private String name_employee;
    private double salary;
    
    public Employee(String name_employee, double salary){
        this.name_employee = name_employee;
        this.salary = salary;
    }
    
    public String getNameEmployee(){
        return name_employee;
    }
    public void setNameEmployee(String name_employee){
        this.name_employee = name_employee;
    }
    
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    
}


    
