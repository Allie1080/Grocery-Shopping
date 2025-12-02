package com.mycompany.groceryshopping;

public abstract class GroceryItem {
    private String name;
    private double basePrice;
    private int baseQuantity;
    private double quantity;
    private String measurement;
    
    
    //Constructor
    GroceryItem(String name, double basePrice, String measurement, int baseQuantity) {
        this.name = name;
        this.basePrice = basePrice;
        this.measurement = measurement;
        this.baseQuantity = baseQuantity;
        
    }   
    
    // Total Cost Calculation 
    
    public abstract double calculateTotalCost();
    
    // Getters and Setters
    
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
    
    public int getBaseAmount() {
        return baseQuantity;
    }
    
    public void setBaseAmount(int baseAmount) {
        this.baseQuantity = baseAmount;
    }
    
    public double getAmount() {
        return quantity;
    }
    
    public String getMeasurement() {
        return measurement;
    }
    
    public void setMeasurement(String measurement) {
        this.measurement = measurement;    
    }
    
    // Method Overloading
    
    public void setQuantity(int quantity) {
        this.quantity = (int) Math.round(quantity);

    }
    
    public void setQuantity(double quantity) {
        this.quantity = quantity;

    }
     
    
    public String getQuantityString() {
        if (quantity - Math.round(quantity) == 0) {
            return String.format("%.0f%s", quantity, measurement);
            
        } else {
            return String.format("%.2f%s", quantity, measurement);
        
        }
        
    }
    

}