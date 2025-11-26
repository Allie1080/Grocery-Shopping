package com.mycompany.groceryshopping;

public class PackagedItem extends GroceryItem {
    private String expirationDate;
    
    //Constructor
    public PackagedItem(String name, double basePrice, int quantity, String expirationDate) {
        super(name, basePrice, quantity);
        this.expirationDate = expirationDate;
    }

    //Getter and Setter
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    /* you might need it ???
    @Override
    public double calculateTotalCost() {
        return super.calculateTotalCost(); // this simply calls the GroceryItem implementation
    }
    */
    
  
}