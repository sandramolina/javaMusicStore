package shop;

import behaviours.ISell;
import instruments.Guitar;
import instruments.Keyboard;
import instruments.enums.*;
import org.junit.Before;
import org.junit.Test;
import otherProducts.Accesory;
import shop.stockList.StockItem;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MusicShopTest {
    //General setup variables
    MusicShop musicShop;
    ArrayList stockList;

    //Instruments
    Guitar guitar;
    Keyboard keyboard;

    //Accessories
    Accesory drumStick;
    Accesory guitarStrings;

    //Stock Items
    StockItem stockItemGuitar;
    StockItem stockItemKeyboard;
    StockItem stockItemDrumSticks;
    StockItem stockItemGuitarStrings;

    @Before
    public void before() {
        stockList =new ArrayList<ISell>();
        musicShop = new MusicShop(stockList, "Dinamo");
    }

    @Test
    public void startsWithZeroItems() {
        assertEquals(0, musicShop.getStockSize());
    }

    @Test
    public void canGetStockList(){
        assertEquals(stockList, musicShop.getStock());
    }

    @Test
    public void canGetStoreName(){
        assertEquals("Dinamo", musicShop.getStoreName());
    }

    @Test
    public void canAddInstrumentsToStock() {
        guitar = new Guitar("Acoustic Guitar", Types.STRING, Colors.MAROON, Materials.WOOD, GuitarTypes.ACOUSTIC);
        keyboard = new Keyboard("Piano", Types.KEYBOARD, Colors.COLORFUL, Materials.PLASTIC, KeyboardTypes.PIANO);

        stockItemGuitar = new StockItem(guitar, 99.0, 105.0);
        stockItemKeyboard = new StockItem(keyboard, 1000.00, 1800.0);

        musicShop.addStockItem(stockItemGuitar);
        musicShop.addStockItem(stockItemKeyboard);

        assertEquals(2, musicShop.getStockSize());
    }

    @Test
    public void canAddAccessoriesToStock(){
        drumStick = new Accesory("Drum Sticks");
        guitarStrings = new Accesory("Guitar Strings");

        stockItemDrumSticks = new StockItem(drumStick, 8.5, 12.5);
        stockItemGuitarStrings = new StockItem(guitarStrings, 5.5, 8.9);

        musicShop.addStockItem(stockItemDrumSticks);
        musicShop.addStockItem(stockItemKeyboard);

        assertEquals(2, musicShop.getStockSize());
    }

    @Test
    public void canRemoveStockItem() {
        guitar = new Guitar("Acoustic Guitar", Types.STRING, Colors.MAROON, Materials.WOOD, GuitarTypes.ACOUSTIC);
        keyboard = new Keyboard("Piano", Types.KEYBOARD, Colors.COLORFUL, Materials.PLASTIC, KeyboardTypes.PIANO);
        drumStick = new Accesory("Drum Sticks");
        guitarStrings = new Accesory("Guitar Strings");

        stockItemGuitar = new StockItem(guitar, 99.0, 105.0);
        stockItemKeyboard = new StockItem(keyboard, 1000.00, 1800.0);
        stockItemDrumSticks = new StockItem(drumStick, 8.5, 12.5);
        stockItemGuitarStrings = new StockItem(guitarStrings, 5.5, 8.9);

        musicShop.addStockItem(stockItemGuitar);
        musicShop.addStockItem(stockItemKeyboard);
        musicShop.addStockItem(stockItemDrumSticks);
        musicShop.addStockItem(stockItemGuitarStrings);

        musicShop.removeStockItem(stockItemGuitar);
        assertEquals(3, musicShop.getStockSize());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        guitar = new Guitar("Acoustic Guitar", Types.STRING, Colors.MAROON, Materials.WOOD, GuitarTypes.ACOUSTIC);
        keyboard = new Keyboard("Piano", Types.KEYBOARD, Colors.COLORFUL, Materials.PLASTIC, KeyboardTypes.PIANO);
        drumStick = new Accesory("Drum Sticks");
        guitarStrings = new Accesory("Guitar Strings");

        stockItemGuitar = new StockItem(guitar, 99.0, 105.0);
        stockItemKeyboard = new StockItem(keyboard, 1000.00, 1800.0);
        stockItemDrumSticks = new StockItem(drumStick, 8.5, 12.5);
        stockItemGuitarStrings = new StockItem(guitarStrings, 5.5, 8.9);

        musicShop.addStockItem(stockItemGuitar);
        musicShop.addStockItem(stockItemKeyboard);
        musicShop.addStockItem(stockItemDrumSticks);
        musicShop.addStockItem(stockItemGuitarStrings);

        assertEquals(813.4, musicShop.calculateTotalPotentialProfit(),0.0);
    }
}
