/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehicle;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args){
        Vehicle car = new Vehicle ("Mazda", "CX-5", 2025);
        
        // Showing First Data
        System.out.println("Brand : "+ car.getBrand());
        System.out.println("Model : "+ car.getModel());
        System.out.println("Years : "+ car.getYears());
        
        // Changing Data
        car.setModel("MX-5");
        car.setYears(2024);
        
        //DIsplaying data after change
        System.out.println("\n-After Data Change-\n");
        System.out.println("New Model : " + car.getModel());
        System.out.println("New Years : " + car.getYears());
        
    }
}
