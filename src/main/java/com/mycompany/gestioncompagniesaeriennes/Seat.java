/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestioncompagniesaeriennes;

/**
 *
 * @author 21655
 */
public class Seat {
    private int id;
    private String type;
    private char row;
    private char column;
    public Seat (int id,String type,char row,char column){ 
        this.id=id;
        this.type=type;
        this.row=row;
        this.column=column;
    }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public char getRow() { return row; }
    public void setRow(char row) { this.row = row; }

    public char getColumn() { return column; }
    public void setColumn(char column) { this.column = column; }
}
