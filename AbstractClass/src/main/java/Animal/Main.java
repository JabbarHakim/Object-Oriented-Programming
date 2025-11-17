/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animal;

/**
 *
 * @author acer
 */
public class Main {
    public  static void main(String[]args){
        Animal cat = new Cat();
        Animal dog = new Dog();
        
        System.out.println("Animal Information");
        cat.sound();
        cat.displayInfo();
        
        dog.sound();
        dog.displayInfo();
    }
}
