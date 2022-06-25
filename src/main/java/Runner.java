import behaviours.ISell;
import instruments.Guitar;
import instruments.Keyboard;
import instruments.enums.*;
import otherProducts.Accesory;
import shop.MusicShop;
import shop.stockList.StockItem;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<ISell> stockList = new ArrayList<>();
        MusicShop musicShop = new MusicShop(stockList, "Dinamica");

        Guitar guitar = new Guitar("Acoustic Guitar", Types.STRING, Colors.MAROON, Materials.WOOD, GuitarTypes.ACOUSTIC);
        Keyboard keyboard = new Keyboard("Piano", Types.KEYBOARD, Colors.COLORFUL, Materials.PLASTIC, KeyboardTypes.PIANO);
        Accesory drumStick= new Accesory("Drum Sticks");
        Accesory guitarStrings = new Accesory("Guitar Strings");

        StockItem stockItemGuitar = new StockItem(guitar, 99.0, 105.0);
        StockItem stockItemKeyboard = new StockItem(keyboard, 1000.00, 1800.0);
        StockItem stockItemDrumSticks = new StockItem(drumStick, 8.5, 12.5);
        StockItem stockItemGuitarStrings = new StockItem(guitarStrings, 5.5, 8.9);

        musicShop.addStockItem(stockItemGuitar);
        musicShop.addStockItem(stockItemKeyboard);
        musicShop.addStockItem(stockItemDrumSticks);
        musicShop.addStockItem(stockItemGuitarStrings);

        //Console in/out
        String hello = String.format("Welcome to %s store", musicShop.getStoreName());
        int initialStock = musicShop.getStockSize();

        System.out.println(hello);
        System.out.println("We currently have " + initialStock + " products in store, would you like to see them?, please answer 'y' or 'n");
        String input = in.nextLine();

        if (input.equalsIgnoreCase("n")){
            System.out.println("No problem, please let me know I can help you with anything else");
        }
        if (input.equalsIgnoreCase("y")){
            stockList.forEach(s -> {
                System.out.println(s.getItem().getName());
            });
            System.out.println("Would you like too see the price for any of them? If so, please write the name:");
            String itemInput = in.nextLine();
            stockList.forEach(s -> {
                if(itemInput.equalsIgnoreCase(s.getItem().getName())) {
                    System.out.println("the price is: " + s.getRetailPrice());
                }
            });

            }
        else {
            System.out.println("Please input a right value: 'y' or 'n'");
        }

    }
}
