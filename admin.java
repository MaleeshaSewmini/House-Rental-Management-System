/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bgcpb
 */
public class admin extends person {
    
   private String adminId;
   private String Password;
    public admin(String Name, String Address, String Email, String adminId, String Phonenumber,String Password){
        super(Name,Address,Email,Phonenumber);
        this.adminId=adminId;
        this.Password=Password;
    }
    public String getadminId(){
        return adminId;
    }
    public void setadminId(String adminId){
        this.adminId=adminId;
    }
     public String getPassword(){
        return adminId;
    }
    public void setPassword(String Password){
        this.Password=Password;
    }
    @Override
    public  void displayDetails(){
         System.out.println("Admin Registered");
        System.out.println("Name:"+super.getName());
        System.out.println("Admin Id:"+adminId);
        System.out.println("Phone number:"+super.getphonenumber());
        System.out.println("Address:"+super.getAddress());
        System.out.println("Email:"+super.getEmail());
    }
}
