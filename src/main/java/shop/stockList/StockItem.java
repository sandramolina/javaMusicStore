package shop.stockList;

import behaviours.ISell;
import behaviours.Sellable;

public class StockItem implements ISell {
    Sellable item;
    private final double costPrice;
    private double retailPrice;

    public StockItem(Sellable item, double costPrice, double retailPrice) {
        this.item = item;
        this.costPrice = costPrice;
        this.retailPrice = retailPrice;
    }

    public Sellable getItem() {
        return item;
    }

    public double getCostPrice() {
        return costPrice;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double calculateMarkup(){
        return (getRetailPrice() - getCostPrice());
    }
}
