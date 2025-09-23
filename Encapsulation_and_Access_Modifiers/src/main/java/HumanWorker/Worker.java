/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HumanWorker;

/**
 *
 * @author acer
 */
public class Worker extends Human{
    private int salary;
    
    public Worker(String name, int age, String jobs, int salary){
        super(name, age, jobs);
        this.salary = salary;
    }
    
    public double getSalary(){
        return salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Name : " + getName()+"\nAge : " + age + "\nJobs : " + jobs + "\nSalary : " + salary;
    }
}
