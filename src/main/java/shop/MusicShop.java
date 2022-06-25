package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class MusicShop {
    private ArrayList<ISell> stock;
    private String storeName;

    public MusicShop(ArrayList<ISell> stock, String storeName) {
        this.stock = stock;
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int getStockSize(){
        return stock.size();
    }

    public void addStockItem(ISell stockItem){
        stock.add(stockItem);
    }

    public void removeStockItem(ISell stockItem){
        stock.remove(stockItem);
    }

    public double calculateTotalPotentialProfit(){

        return stock.stream().reduce(0.0,
                (subtotal, item)-> subtotal + item.calculateMarkup(), Double::sum);
    }
}
