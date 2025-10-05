/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsi;

/**
 *
 * @author ER-HA
 */
public class ContractEmployee extends Employee{
    public int contract_period;
    
    public ContractEmployee(String name_employee, double salary, int contract_period){
        super(name_employee, salary);
        this.contract_period = contract_period;
    }
    
    public void displayInfo(){
        System.out.println("Employee name is " + getNameEmployee() + " this employee got Salary $" + getSalary() +
                "\nInformation about this Employee is has Contract Employee Category and got " + contract_period + " Months contract period !");
    }
    
    
}
