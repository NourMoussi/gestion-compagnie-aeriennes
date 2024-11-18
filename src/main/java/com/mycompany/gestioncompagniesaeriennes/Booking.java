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
public class Booking {
    private int id;
    private float price;
    private Date date;
    
    public Booking ( int id,float price,Date date){
        this.id=id;
        this.price=price;
        this.date=date;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public float getPrice() { return price; }
    public void setPrice(float price) {
        if (price < 0) {
            throw new IllegalArgumentException("Le prix ne peut pas être négatif.");
        }
        this.price = price;
    }
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public void confirm() {
        // Implémentation
    }

    public void cancel() {
        // Implémentation
    }
}

    
