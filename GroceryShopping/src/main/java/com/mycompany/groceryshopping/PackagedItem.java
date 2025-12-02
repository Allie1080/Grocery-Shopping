package com.mycompany.groceryshopping;

public class PackagedItem extends GroceryItem {
    private String expirationDate;
    
    //Constructor
    PackagedItem(String name, double basePrice, String measurement, int baseQuantity, String expirationDate) {
        super(name, basePrice, measurement, baseQuantity);
        this.expirationDate = expirationDate;
    }

    //Getter and Setter
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    
    @Override
    public double calculateTotalCost() {
        return (getBasePrice() / getBaseAmount()) * getAmount();
    }
    
    
  
}