/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

/**
 *
 * @author user
 */
public class Vehicle {

    private static boolean MyBrand;

    private String myBrand, myModel;
    public Vehicle() {
        myBrand = "unknown";
        myModel = "unknown";
    } 
    public Vehicle(String brand, String model) {
        setBrand(brand);
        setModel(model);
    }
    public String getBrand() {
        return myBrand;
    }
    public String getModel() {
        return myModel;
    }
    public void setBrand(String brand) {
        myBrand = brand;
    }
    public void setModel(String model) {
        myModel = model;
    }
    public String toString() { 
        return getBrand() + " " + getModel();
    }   
    public static void main(String[] args){
       System.out.println(MyBrand);
   } 
}

