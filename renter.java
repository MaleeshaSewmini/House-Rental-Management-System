/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bgcpb
 */
public class renter extends person {
    private String NIC;
    private String Gender;
    private String preferedpropertytype;
    private String paymentmethod;
    private String Occupation;
    private String RenterId;
    public renter(String Name, String RenterId, String Address, String Email, String phonenumber, String Gender, String Occupation, String NIC, String preferedpropertytype,String paymentmethod){
        super(Name,Address, Email,phonenumber);
        this.NIC=NIC;
        this.Gender=Gender;
        this.Occupation=Occupation;
        this.paymentmethod=paymentmethod;
        this.preferedpropertytype=preferedpropertytype;
        this.RenterId=RenterId;
        
    }
    public String getNIC(){
        return NIC;
    }
     public String getpreferedpropertytype(){
        return preferedpropertytype;
    }
      public String getRenterId(){
        return RenterId;
    }
     public void setRenterId(String RenterId){
        this.RenterId=RenterId;
    }
     public String getpaymentmethod(){
        return paymentmethod;
    }
     public String getOccupation(){
        return Occupation;
    }
     public String getGender(){
        return Gender;
    }
     public void setGender(String Gender){
        this.Gender=Gender;
    }
     public void setNIC(String NIC){
        this.NIC=NIC;
    }
      public void setpreferedpropertytype(String preferedpropertytype){
        this.preferedpropertytype=preferedpropertytype;
    }
      
      public void setpaymentmethod(String paymentmethod){
        this.paymentmethod=paymentmethod;
    } 
     public void setOccupation(String Occupation){
        this.Occupation=Occupation;
    } 
     
      
    @Override
     public void displayDetails(){
        System.out.println("---Renter Registered---");
        System.out.println("Name:"+super.getName());
        System.out.println("RenterId:"+RenterId);
        System.out.println("Address:"+super.getAddress());
        System.out.println("Email:"+super.getEmail());
        System.out.println("Phone number:"+super.getphonenumber());
        System.out.println("Gender:"+Gender);
        System.out.println("Occupation:"+Occupation);
        System.out.println("NIC:"+NIC);
        System.out.println("preferedpropertytype:"+preferedpropertytype);
        System.out.println("paymentmethod:"+paymentmethod);
         
     }
     
}
