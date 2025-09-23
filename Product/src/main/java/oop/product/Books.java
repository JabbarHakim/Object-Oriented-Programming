/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.product;

/**
 *
 * @author acer
 */
public class Books extends Product {

    public Books(String name, double price) {
        super(name, price);
    }
 
    @Override
    public double countDiscount(){
        return price * 0.15;
    }
    
    
}
