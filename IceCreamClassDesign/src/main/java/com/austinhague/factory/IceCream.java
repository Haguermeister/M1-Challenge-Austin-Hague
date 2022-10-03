package com.austinhague.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IceCream {
    public String flavor;
    private int inventory;
    private int soldInventory;
    private double grossIncome;
    private double salePrice; // in USD
    private double productionCost; // In USD
    private int productionTime; // In Hours
    private List<String> ingredients = new ArrayList<>();

    public IceCream() {
    }

    public IceCream(String flavor, int inventory, double salePrice, double productionCost, int productionTime, List<String> ingredients) {
        this.flavor = flavor;
        this.inventory = inventory;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;
    }

    public void sellUnits(int numberSold) {
        if (this.inventory > numberSold) {
            System.out.println("Inventory before sale was" + this.inventory + " " + this.flavor + " units.");
            System.out.println("Sold" + numberSold + " " + this.flavor + " units.");
            this.soldInventory += numberSold;
            this.inventory -= numberSold;
            this.grossIncome = numberSold * this.salePrice;
            System.out.println("Current Inventory : " + this.inventory + " Total Sold Inventory : " + this.soldInventory);
        }
        if (this.inventory <= numberSold) {
            System.out.println("Error : There is only " + this.inventory + "amount of " + this.flavor + " units left.");
        }
    }

    public double calculateGrossIncome() {
        if(this.grossIncome == (this.soldInventory*this.salePrice)) {
            System.out.println("Your current gross income is " + grossIncome + " USD.");
            return this.grossIncome;
        } else{
            this.grossIncome = this.soldInventory*this.salePrice;
            System.out.println("Your current gross income is " + grossIncome + " USD.");
            return this.grossIncome;
        }
    }

    public void calculateCostPerHour() {
        System.out.println("The current production cost per hour is " + (this.productionCost/this.productionTime)+ " USD/hr.");
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public int getSoldInventory() {
        return soldInventory;
    }

    public void setSoldInventory(int soldInventory) {
        this.soldInventory = soldInventory;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public int getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(int productionTime) {
        this.productionTime = productionTime;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", inventory=" + inventory +
                ", soldInventory=" + soldInventory +
                ", grossIncome=" + grossIncome +
                ", salePrice=" + salePrice +
                ", productionCost=" + productionCost +
                ", productionTime=" + productionTime +
                ", ingredients=" + ingredients +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return inventory == iceCream.inventory && soldInventory == iceCream.soldInventory && Double.compare(iceCream.grossIncome, grossIncome) == 0 && Double.compare(iceCream.salePrice, salePrice) == 0 && Double.compare(iceCream.productionCost, productionCost) == 0 && productionTime == iceCream.productionTime && Objects.equals(flavor, iceCream.flavor) && Objects.equals(ingredients, iceCream.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, inventory, soldInventory, grossIncome, salePrice, productionCost, productionTime, ingredients);
    }
}