/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vehicle;

/**
 *
 * @author acer
 */
public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        
        System.out.println("Car Information");
        car.running();
        car.info();
        
        System.out.println("\nBicycle Information");
        bicycle.running();
        bicycle.info();
        
    }
}
