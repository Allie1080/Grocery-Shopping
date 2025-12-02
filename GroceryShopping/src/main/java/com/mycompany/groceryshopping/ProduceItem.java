package com.mycompany.groceryshopping;

public class ProduceItem extends GroceryItem {    
    private boolean isOrganic;
    
    //Constructor
    ProduceItem(String name, double basePrice, String measurement, int baseQuantity, boolean isOrganic) {
        super(name, basePrice, measurement, baseQuantity);
        this.isOrganic = isOrganic;
    }

    //Getter and Setter
    public boolean isOrganic() {
        return isOrganic;
    }

    public void setOrganic(boolean organic) {
        isOrganic = organic;
    }

    //Override CalculatorCost for 2% increase
    @Override
    public double calculateTotalCost() {
        double currentPrice = getBasePrice() / getBaseAmount();
        
        if (isOrganic) {
            currentPrice *= 1.02; // this is 2%
        }
        
        return currentPrice * getAmount();
    }
}