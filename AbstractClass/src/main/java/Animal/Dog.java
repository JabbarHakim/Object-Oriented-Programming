/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author acer
 */
public class Dog extends Animal{
    
    @Override
    void sound(){
        System.out.println("Woof Woof Woof!");
    }
    
    void displayInfo(){
        super.displayInfo();
        System.out.println("Category Animal : Dog\n");
    }
}

