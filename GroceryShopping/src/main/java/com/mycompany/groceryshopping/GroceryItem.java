package com.mycompany.groceryshopping;

public class GroceryItem {
    private String name;
    private double basePrice;
    private int quantity;
    //Constructor
    public GroceryItem(String name, double basePrice, int quantity) {
        this.name = name;
        this.basePrice = basePrice;
        this.quantity = quantity;
    }    
    //Total Cost Calculation 
    public double calculateTotalCost(){
        return basePrice * quantity;
    }
    
    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
    public int getQuantity() {
        return quantity;
    }
    
    //Not Overloaded Method
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    // Overloaded Method
    public void setQuantity(double newQuantity) {
        this.quantity = (int) Math.round(newQuantity);
    }

}