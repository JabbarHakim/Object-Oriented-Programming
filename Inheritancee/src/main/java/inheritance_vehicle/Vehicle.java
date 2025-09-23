/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_vehicle;

/**
 *
 * @author ER-HA
 */
public class Vehicle {
    private String lp;  // License Plate
    public String brand;
    protected int year;
    
    public String getLP(){
        return lp;
    }
    public void setLP(String lp){
        this.lp = lp;
    }
    
    public Vehicle(String lp, String brand, int year){
        this.lp = lp;
        this.brand = brand;
        this.year = year;
    }
    public String DisplayInfo(){
        return "Vehicle License Plate : " + lp + "\nBrand : " + brand + "\n Year Production : " + year;
    }
    public String CheckEngine(){
        return "Engine Status : Healthty";
    }
}
