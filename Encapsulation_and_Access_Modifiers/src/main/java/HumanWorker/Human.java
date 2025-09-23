/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HumanWorker;

/**
 *
 * @author acer
 */
public class Human {
    private String name;
    protected int age;
    public String jobs;
    
    public Human(String name, int age, String jobs){
    this.name = name;
    this.age = age;
    this.jobs = jobs;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}

