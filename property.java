/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bgcpb
 */

public abstract class property {
    private String propertyId;
    private String location;
    private double basePrice;   // fixed base price

    public property(String propertyId, String location, double basePrice) {
        this.propertyId = propertyId;
        this.location = location;
        this.basePrice = basePrice;
    }
    public String getpropertyId( ) {
        return propertyId;
    }
    public void setpropertyId(String propertyId ){
        this.propertyId=propertyId;
    }
    public String getlocation() {
        return location;
    }
    public void setlocation(String location ){
        this.location=location;
    }
    public double basePrice() {
        return basePrice;
    }
    public void setbasePrice(double basePrice ){
        this.basePrice=basePrice;
    }
    
     public abstract double calculateBaseRent();
     public abstract void displayPropertyDetails();
        
    
}
