/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice_Interface_Payment;

/**
 *
 * @author ER-HA
 */
public class Main {
    public static void main(String[] args){
       Electronic Laptop = new Electronic();
       Food Cake = new Food();
       
       double priceLaptop = 1235;
       double priceCake = 15;
       
       System.out.println("Tax for Laptop in Electronic Category : $" + Laptop.count_tax(priceLaptop));
       System.out.println("Tax for Cake in Food Category : $" + Cake.count_tax(priceCake));
    }
    
}
