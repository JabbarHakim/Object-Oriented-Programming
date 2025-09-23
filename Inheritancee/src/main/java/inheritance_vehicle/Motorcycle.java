/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_vehicle;

/**
 *
 * @author ER-HA
 */
public class Motorcycle extends Land_Vehicle{
    public int EngineCC;
    
    public Motorcycle(String lp, String brand, int year, String Fuel_Type, int EngineCC){
        super(lp, brand, year, Fuel_Type);
        this.EngineCC = EngineCC;
    }
    @Override
    public String DisplayInfo(){
        return "Land Vehicle License Plate : " + getLP()
                + "\nBrand : " + brand + "\nYear : " + year
                + "\nFuel Type : " + getFT() + "\nDoors : " + EngineCC;
    }
    
    
}
