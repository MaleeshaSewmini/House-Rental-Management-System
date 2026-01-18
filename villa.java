/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bgcpb
 */
public  class villa extends property {
    private String villaname;
    private int numberOfRooms;
    private boolean hasSwimmingPool;
    private double dailyRate;
    private String RenterId;
    private int daysrented;
    private  double totalfee;
    public villa(String Villaname, String RenterId, String propertyId, String location, double basePrice, Integer numberOfRooms, String hasSwimmingPool, Integer daysrented, double dailyRate, double totalfee) {

        super(propertyId, location, basePrice); 
        this.villaname=villaname;
        this.numberOfRooms = numberOfRooms;
        this.hasSwimmingPool = hasSwimmingPool.equalsIgnoreCase("Yes");
        this.dailyRate = dailyRate;
        this.RenterId=RenterId;
        this.totalfee=totalfee;
        this.daysrented=daysrented;
        
    }
    public int getnumberOfRooms( ) {
        return numberOfRooms;
    }
    public double getdailyRate( ) {
        return dailyRate;
    }
    
    public String getRenterId( ) {
        return RenterId;
    }
    public int getdaysreneted( ) {
        return daysrented;
    }
    public void setdaysreneted(){
        this.daysrented=daysrented;
    }
     public boolean gethasSwimmingPool( ) {
        return hasSwimmingPool;
    }
     public String getvillaname( ) {
        return villaname;
    }
     public void setvillaname(){
        this.villaname=villaname;
    }
     public double gettotalfee( ) {
        return totalfee;
    }
     public void settotalfee(double totalfee){
        this.totalfee=totalfee;
    }
    public void setnumberOfRooms(int numberOfRooms){
        this.numberOfRooms=numberOfRooms;
    }
    public void setdailyRate(double dailyRate ){
        this.dailyRate=dailyRate;
    }
    public void setRenterId(String RenterId ){
        this.RenterId=RenterId;
    }
    public void sethasSwimmingPool(boolean hasSwimmingPool ){
        this.hasSwimmingPool=hasSwimmingPool;
    } 
    
    @Override
    public double calculateBaseRent( ) {
        
        if (daysrented <= 0) {
            throw new IllegalArgumentException("Days rented must be greater than 0");
        }

        double total = dailyRate * daysrented;

        if (numberOfRooms > 3) {
            total += (numberOfRooms - 3) * 500; // extra room charge
        }

        if (hasSwimmingPool) {
            total += 2000; // pool fee
        }

        total += super.basePrice(); // property fixed price
        return total;
    
    }
    @Override
     public  void displayPropertyDetails(){
         System.out.println("---Villa Allocated---");
         System.out.println("Villa name:"+villaname);
         System.out.println("Renter Id:"+RenterId);
         System.out.println("Property Id:"+super.getpropertyId());
         System.out.println("Location:"+super.getlocation());
         System.out.println("base price:"+super.basePrice());
         System.out.println("number of rooms:"+numberOfRooms);
         System.out.println("Swimmingpool:"+hasSwimmingPool);
         System.out.println("days rented:"+daysrented);
         System.out.println("daily rate:"+dailyRate);
         System.out.println("Total fee:"+totalfee);
         
         
         
     }
    
}
