/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_vehicle;

/**
 *
 * @author ER-HA
 */
public class Car extends Land_Vehicle{
    public int doors;
    
   
    public Car(String lp, String brand, int year, String Fuel_Type, int doors){
        super(lp, brand, year, Fuel_Type);
        this.doors = doors;
    }
    @Override
    public String DisplayInfo(){
        return "Land Vehicle License Plate : " + getLP()
                + "\nBrand : " + brand + "\nYear : " + year
                + "\nFuel Type : " + getFT() + "\nDoors : " + doors;
    }
}
