package com.mycompany.groceryshopping;

public class ProduceItem extends GroceryItem {    
    private boolean isOrganic;
    
    //Constructor
    public ProduceItem(String name, double basePrice, int quantity, boolean isOrganic) {
        super(name, basePrice, quantity);
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
        double currentBasePrice = getBasePrice();       
        if (isOrganic) {
            currentBasePrice *= 1.02; // this is 2%
        }
        
        return currentBasePrice * getQuantity();
    }
}