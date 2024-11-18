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
public class Customer extends Personne {
    private String address;
    public Customer (int id , String password , String email , String phone , Date birthday , String cin,String address)
    {   
        super(id,password,email,phone,birthday,cin);
        this.address=address; 
    }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public void updateProfile() {
        // Implémentation
    }

    public void getHistory() {
        // Implémentation
    }
}
