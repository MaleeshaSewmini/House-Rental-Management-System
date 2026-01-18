/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bgcpb
 */
public abstract class House implements Rentcalculatable{
    private String HouseNo;
    private String RenterId;
    private String PropertyId;
    private String Location;
    private double Baserent;
    private int Duration;
    private String hasgarden;
    private String haspets;
    private double TotalFee;
  
    
    
    public House(String HouseNo,String RenterId,String PropertyId, String Location, double Baserent,int Duration,
                 String hasgarden, String hasPets,double TotalFee) {
        this.HouseNo=HouseNo;
        this.PropertyId = PropertyId;
        this.Location = Location;
        this.Baserent = Baserent;
        this.Duration=Duration;
        this.hasgarden = hasgarden;
        this.haspets = haspets;
    }
    public String getHouseNo(){
        return HouseNo;
    }
    public void setHouseNo(){
        this.HouseNo=HouseNo;
    }
     public String getRenterId(){
        return HouseNo;
    }
    public void setRenterId(){
        this.HouseNo=HouseNo;
    }
    public String getPropertyId(){
        return PropertyId;
    }
    public void setpropertyId(){
        this.PropertyId=PropertyId;
    }
     public String getLocation(){
        return Location;
    }
     public void setLocation(){
        this.Location=Location;
    } 
     public double getBaserent(){
        return Baserent;
    }
     public void setBaserent(){
        this.Baserent=Baserent;
    }
     public int getDuration(){
        return Duration;
    }
     public void setDuration(){
        this.Duration=Duration;
    }
     
     
    public String gethasgarden(){
        return hasgarden ;
    } 
     public void sethasgarden(){
        this.hasgarden=hasgarden;
    }
      public String gethaspets(){
        return haspets ;
    }
      public void sethaspets(){
        this.haspets=haspets;
    }
     public double getTotalFee(){
        return TotalFee ;
    }
      public void setTotalFee(){
        this.TotalFee=TotalFee;
    }
   public abstract int getNumberOfRooms();
      
      
}
