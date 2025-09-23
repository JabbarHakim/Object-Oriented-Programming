/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_vehicle;

/**
 *
 * @author ER-HA
 */
public class Land_Vehicle extends Vehicle {
    private String Fuel_Type;
    
    public String getFT(){
        return Fuel_Type;
    }
    public void setFT(String Fuel_Type){
        this.Fuel_Type = Fuel_Type;
    }
    
    public Land_Vehicle(String lp, String brand, int year, String Fuel_Type){
        super(lp, brand, year);
        this.Fuel_Type = Fuel_Type;
    }
    
    @Override
    public String DisplayInfo(){
        return "Land Vehicle License Plate : " + getLP()
                + "\n Brand : " + brand + "\n Year : " + year
                + "Fuel Type : " + getFT();
    }

}

