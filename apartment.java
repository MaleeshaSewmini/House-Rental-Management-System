/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */




/**
 *
 * @author bgcpb
 */
public class apartment extends property{
    private String ApartmentaName;
    private String RenterId;
    private int Numberofrooms;
    private int floorlevel;
    private boolean Elevator;
    private double MonthlyRate;
    private int MonthsRented;
    private double Totalfee;
    private boolean hasElevator;
   
    public apartment(String apartmentaname, String propertyId, String RenterId, String location, double basePrice, int Numberofrooms,int floorlevel, String Elevator, Double MonthlyRate, int monthsRented, Double Totalfee1){
        super(propertyId,location,basePrice);
        this.Totalfee = Totalfee;
        this.RenterId=RenterId;
        this.ApartmentaName=ApartmentaName;
        this.floorlevel=floorlevel;
        this.Elevator=Elevator.equalsIgnoreCase("Yes");
        this.MonthlyRate=MonthlyRate;
        this.MonthsRented=MonthsRented;
        this.Numberofrooms=Numberofrooms;
        this.Totalfee=Totalfee;
        
    }

 
    public double getTotalfee( ) {
        return Totalfee;
    }
    public void setTotalfee(double propertyId ){
        this.Totalfee=Totalfee;
    }
    
    public String getRenterId( ) {
        return RenterId;
    }
     public void setRenterId(String RenterId ){
        this.RenterId=RenterId;
    }
     public String getApartmentaName( ) {
        return ApartmentaName;
    }
      public void setapartmentaname(String apartmentaname ){
        this.ApartmentaName=ApartmentaName;
    }
     public int getfloorlevel( ) {
        return floorlevel;
    }
     public void setfloorlevel(int floorlevel ){
        this.floorlevel=floorlevel;
    }
     public boolean  getElevator( ) {
        return Elevator;
    }
     public void setElevator(boolean Elevator ){
        this.Elevator=Elevator;
    }
     public double  getMonthlyRate( ) {
        return MonthlyRate;
    }
      public void setMonthlyRate(double MonthlyRate ){
        this.MonthlyRate=MonthlyRate;
    }
      public double  getMonthsRented( ) {
        return MonthsRented;
    } 
     public void setMonthsRented(int MonthsRented ){
        this.MonthsRented=MonthsRented;
    } 
     public int  getNumberofrooms( ) {
        return Numberofrooms;
    }
     public void setNumberofrooms(int Numberofrooms ){
        this.Numberofrooms=Numberofrooms;
    }
    
    @Override
    public  double calculateBaseRent(){
        double total = MonthlyRate * MonthsRented;
        if (floorlevel > 10) {
            total -= (floorlevel - 10) * 200;
        }

        // Extra room charge
        if (Numberofrooms > 2) {
            total += (Numberofrooms- 2) * 300;
        }
       if (floorlevel > 10 && !hasElevator) {
            total += 500;
        }

        // Base price stays constant
        total += super.basePrice();
        return total;
        
    }
    @Override
    public  void displayPropertyDetails(){
        System.out.println("----Apartment"+ ApartmentaName + "floor level"+floorlevel+"Allocated");
        System.out.println("Apartment name:"+ApartmentaName);
        System.out.println("Property Id:"+super.getpropertyId());
        System.out.println("Renter Id:"+RenterId);
        System.out.println("Location:"+super.getlocation());
        System.out.println("base price:"+super.basePrice());
        System.out.println("no of rooms:"+Numberofrooms);
        System.out.println("floor level:"+floorlevel);
        System.out.println("Elevator :"+hasElevator);
        System.out.println("Monthly Rate:"+MonthlyRate);
        System.out.println("Months Rented:"+MonthsRented);
        System.out.println("Total fee:"+Totalfee);
}
}
