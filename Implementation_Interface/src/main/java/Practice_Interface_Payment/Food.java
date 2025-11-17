/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice_Interface_Payment;

/**
 *
 * @author ER-HA
 */
public class Food implements Payment {
    @Override
    public double count_tax(double price){
        return price * 0.05;
    }
    
}
