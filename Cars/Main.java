/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cars;

/**
 *
 * @author ER-HA
 */
public class Main {
     public static void main(String[] args) {
         Cars cars1 = new Cars("Mazda", "CX-5", 2025, "Black");
         Cars cars2 = new Cars("Toyota", "Supra", 2025, "White");
         
         cars1.displayInfo();
         cars2.displayInfo();
         
         cars1.StartEngine();
         cars2.StartEngine();
         
         cars1.setColors("White");
         cars2.setColors("Black");
         
         System.out.println("\nAfter change the Colors");
         cars1.displayInfo();
         cars2.displayInfo();
     }
}
