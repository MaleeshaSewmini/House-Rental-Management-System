/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bgcpb
 */
public class housewith3rooms extends House{
    private String HouseNo;
    private String RenterId;
    private String PropertyId;
    private String Location;
    private double Baserent;
    private int Duration;
    private String hasgarden;
    private String haspets;
    private double TotalFee;
   public housewith3rooms(String HouseNo, String RenterId, String propertyId, String Location, double Baserent, int Duration, String hasgarden, String haspets, double TotalFee) {
         super(HouseNo,RenterId,propertyId,Location,Baserent,Duration,hasgarden,haspets,TotalFee);
          this.HouseNo=HouseNo;
        this.PropertyId = PropertyId;
        this.Location = Location;
        this.Baserent = Baserent;
        this.Duration=Duration;
        this.hasgarden = hasgarden;
        this.haspets = haspets;
    }
    @Override
     public String getHouseNo(){
        return HouseNo;
    }
    @Override
    public void setHouseNo(){
        this.HouseNo=HouseNo;
    }
    @Override
     public String getRenterId(){
        return HouseNo;
    }
    @Override
    public void setRenterId(){
        this.HouseNo=HouseNo;
    }
    @Override
    public String getPropertyId(){
        return PropertyId;
    }
    @Override
    public void setpropertyId(){
        this.PropertyId=PropertyId;
    }
    @Override
     public String getLocation(){
        return Location;
    }
    @Override
     public void setLocation(){
        this.Location=Location;
    } 
    @Override
     public double getBaserent(){
        return Baserent;
    }
    @Override
     public void setBaserent(){
        this.Baserent=Baserent;
    }
    @Override
     public int getDuration(){
        return Duration;
    }
    @Override
     public void setDuration(){
        this.Duration=Duration;
    }
     
     
    @Override
    public String gethasgarden(){
        return hasgarden ;
    } 
    @Override
     public void sethasgarden(){
        this.hasgarden=hasgarden;
    }
    @Override
      public String gethaspets(){
        return haspets ;
    }
    @Override
      public void sethaspets(){
        this.haspets=haspets;
    }
    @Override
     public double getTotalFee(){
        return TotalFee ;
    }
    @Override
      public void setTotalFee(){
        this.TotalFee=TotalFee;
    }
   @Override
    public int getNumberOfRooms() {
        return THREE_ROOMS;
    }
   @Override
    public double calculateRent() {

        double monthly = getBaserent() + 8000;

         if (hasgarden.equalsIgnoreCase("Yes")) {
            monthly += 3500;
        }
        if (haspets.equalsIgnoreCase("Yes")) {
            monthly += 4000;
        }

        return monthly * getDuration();

}
    public void displayDetails() {
        System.out.println("House No: " + HouseNo); 
        System.out.println("RenterId: " + RenterId); 
        System.out.println("property ID: " + PropertyId);
        System.out.println("Location: " + Location);
        System.out.println("Baserent: " + Baserent);
        System.out.println("Duration (Months): " + Duration);
        System.out.println("Garden: " + hasgarden );
        System.out.println("Pets: " + haspets );
        System.out.println("Total Fee: " + calculateRent());
      
    }
    
    
    
    
    
    
    
    
}

