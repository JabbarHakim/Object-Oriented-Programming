/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_vehicle;

/**
 *
 * @author ER-HA
 */
public class Main {
    public static void main(String[] args){
    System.out.println("+++ VEHICLE INHERITANCE +++");
    
    Car car1 = new Car("AA4291ZA", "Toyota", 2023, "Pertalite", 4);
    
    Motorcycle bike1 = new Motorcycle("AA9999BA","Yamaha",2025,"Pertalite",155);
    
    System.out.println("\n +++ Information Car +++");
    System.out.println(car1.DisplayInfo());
    
    System.out.println("\n +++ Information Motorcycle +++");
    System.out.println(bike1.DisplayInfo());
    }
}
