/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsi;

/**
 *
 * @author ER-HA
 */
public class Electronic extends Product {
    public int warranty;
    
    public Electronic(String nameproduct, double price, int warranty){
        super(nameproduct, price);
        this.warranty = warranty;
        
    }
    
    public void displayInfo(){
        System.out.println("The product name is " + getNameProduct() + " and for the price is $" + getPrice() 
                + "\nThis product is Electronic Category and has a Warranty for " + warranty + " Years!\n "); 
    }
}
