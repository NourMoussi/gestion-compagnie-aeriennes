/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncompagniesaeriennes;
import java.util.Date;
        /**
 *
 * @author 21655
 */
public class Personne {
    int id ;
    String password ;
    String email ;
    String phone ;
    Date birthday ;
    String cin ;
    public Personne (int id , String password , String email , String phone , Date birthday , String cin ){
        this.id=id;
        this.password=password;
        this.email=email;
        this.phone=phone;
        this.birthday=birthday;
        this.cin=cin;
    }
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public Date getBirthday() {
        return birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    public String getCin() {
        return cin;
    }
    
    public void setCin(String cin) {
        this.cin = cin;
    }
}
    
    

