/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.product;

/**
 *
 * @author acer
 */
abstract class Product {
    String name;
    double price;
    
    
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public abstract double countDiscount();
    
    public void normalPrice(){
        System.out.println("Price for " + name +  " is " + price);
    }
}