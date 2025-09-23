/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance_animal;

/**
 *
 * @author ER-HA
 */
public class Animal {
    protected String name;
    protected String species;
    
    public Animal(String name, String species){
        this.name = name;
        this.species = species;
    }
    
    public String displayInfo(){
        return "Animal Name : " + name + "Species : " + species;
    }
    
    public String sound(){
        return "Animal voice : ";
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSpecies(){
        return species;
    }
    public void setSpecies(String species){
        this.species = species;
    }
}

