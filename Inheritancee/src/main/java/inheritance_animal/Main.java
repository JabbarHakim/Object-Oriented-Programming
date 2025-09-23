/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance_animal;

/**
 *
 * @author ER-HA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("+++ INHERITANCE ANIMAL +++");
        
        Cat cat1 = new Cat("Oreo","Mainecoon", "Calico");
        Cat cat2 = new Cat("Bel","Persian", "Short Hair");
        
        Dog dog1 = new Dog("Po", "Siberian Husky", "Wolf");
        Dog dog2 = new Dog("Lo", "Alaskan Malamute", "wolf");
        
        System.out.println("\n+++ Cat Information +++");
        System.out.println(cat1.displayInfo());
        System.out.println(cat2.displayInfo());
        System.out.println(cat1.name + " voice : " + cat1.sound());
        System.out.println(cat2.name + " voice : " + cat2.sound());
        
        System.out.println("\n+++ Dog Information +++");
        System.out.println(dog1.displayInfo());
        System.out.println(dog2.displayInfo());
        System.out.println(dog1.name + " voice : " + dog1.sound());
        System.out.println(dog2.name + " voice : " + dog2.sound());
        
        
        
        
    }
}
