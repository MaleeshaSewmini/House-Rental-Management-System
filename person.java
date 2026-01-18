/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bgcpb
 */
public abstract class person {
    private String Name;
    private String Address;
    private String Email;
    private String phonenumber;
    
    
    public person( String Name,String Address,String Email,String phonenumber){
        this.Name=Name;
        this.Address=Address;
        this.Email=Email;
        this.phonenumber=phonenumber;
       
        
    }
    public String getName(){
        return Name;
    }
    public void setName(String Name){
        this.Name=Name;
    }
     public String getAddress(){
        return Address;
    }
     public void setAddress(String Address){
        this.Address=Address;
    }
      public String getEmail(){
        return Email;
    }
        public void setEmail(String Email){
        this.Email=Email;
    }
    public String getphonenumber(){
        return phonenumber;
    }
      public void setphonenumber(String phonenumber){
        this.phonenumber=phonenumber;
    }
   
      public abstract void displayDetails();
}
