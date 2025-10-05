/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsi;

/**
 *
 * @author ER-HA
 */
public class Product {
    private String nameproduct;
    private double price;
    
    public Product(String nameproduct, double price){
        this.nameproduct = nameproduct;
        this.price = price;
    }
    
    public String getNameProduct(){
        return nameproduct;
    }
    
    public void setNameProduct(String nameproduct){
        this.nameproduct = nameproduct;
    }
    
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
   
}
