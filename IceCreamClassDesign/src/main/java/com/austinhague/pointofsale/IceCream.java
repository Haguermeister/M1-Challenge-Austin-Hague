
package com.austinhague.pointofsale;

        import java.util.Objects;

public class IceCream {
    public String flavor;
    public double price;
    public int quantity;
    private int soldQuantity;
    private double grossIncome;
    private double tipsIncome;

    public IceCream() {
    }

    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public void sellUnits(int unitsSold, double tipsRecieved){
        if (unitsSold>0){
            this.quantity-=unitsSold;
            this.soldQuantity+=unitsSold;
            this.grossIncome+=(unitsSold*price);
            if(tipsRecieved>0){
                this.tipsIncome+=tipsRecieved;
            }
        }
        else {
            System.out.println("Sorry please enter a positive whole number for amount of units sold.");
        }
    }
    public void addUnits(int unitsAdded){
        if(unitsAdded>0){
            this.quantity+=unitsAdded;
            System.out.println("Inventory has been updated to " + this.quantity + " " + this.flavor + " units.");
        }
        else{
            System.out.println("Error : Please enter a positive whole number of units added to inventory.");
        }
    }
    public void subtractUnits(int unitsSubtracted){
        if(unitsSubtracted>0){
            this.quantity-=unitsSubtracted;
            System.out.println("Inventory has been updated to " + this.quantity + " " + this.flavor + " units.");
        }
        else{
            System.out.println("Error : Please enter a positive whole number of units subtracted to inventory.");
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(int soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double getTipsIncome() {
        return tipsIncome;
    }

    public void setTipsIncome(double tipsIncome) {
        this.tipsIncome = tipsIncome;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", soldQuantity=" + soldQuantity +
                ", grossIncome=" + grossIncome +
                ", tipsIncome=" + tipsIncome +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IceCream iceCream = (IceCream) o;
        return Double.compare(iceCream.price, price) == 0 && quantity == iceCream.quantity && soldQuantity == iceCream.soldQuantity && Double.compare(iceCream.grossIncome, grossIncome) == 0 && Double.compare(iceCream.tipsIncome, tipsIncome) == 0 && Objects.equals(flavor, iceCream.flavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flavor, price, quantity, soldQuantity, grossIncome, tipsIncome);
    }
}
