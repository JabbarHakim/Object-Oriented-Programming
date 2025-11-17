/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author acer
 */
public class Cat extends Animal{
    
    @Override
    void sound(){
        System.out.println("Meow Meow Meow!");
    }
    
    void displayInfo(){
        super.displayInfo();
        System.out.println("Category Animal : Cat\n");
    }
}
