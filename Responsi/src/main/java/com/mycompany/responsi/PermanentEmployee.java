/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsi;

/**
 *
 * @author ER-HA
 */
public class PermanentEmployee extends Employee {
    public double employee_allowance;
    
    public PermanentEmployee(String name_employee, double salary, double employee_allowance){
        super(name_employee, salary);
        this.employee_allowance = employee_allowance;
    }
    
   
    public void displayInfo(){
        System.out.println("Employee name is " + getNameEmployee() + " this employee got Salary $"+ getSalary() +
                "\nInformation about this Employee is has Permanent Employee Category and got $" + employee_allowance + " allowance! \n");
    }
    
}
