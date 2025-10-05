/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsi;

/**
 *
 * @author ER-HA
 */
public class Foods extends Product{
    public String date_exp;
    
    public Foods(String nameproduct, double price, String date_exp){
        super(nameproduct, price);
        this.date_exp = date_exp;
    }
    
    public void displayInfo(){
        System.out.println("The product name is " + getNameProduct() + " and for the price is $" + getPrice() 
                + "\nThis product is Foods Category and has a Date Expired in " + date_exp + " this product will expired!\n"); 
    }
}
