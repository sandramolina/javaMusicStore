package shop.stockList;

import instruments.Guitar;
import instruments.enums.Colors;
import instruments.enums.GuitarTypes;
import instruments.enums.Materials;
import instruments.enums.Types;
import org.junit.Before;
import org.junit.Test;
import otherProducts.Accesory;

import static org.junit.Assert.*;

public class StockItemTest {
    StockItem stockItem;
    StockItem stockItem2;
    Guitar guitar;
    Accesory accesory;
    @Before
    public void  before() {
        guitar = new Guitar("Acoustic Guitar", Types.STRING, Colors.MAROON, Materials.WOOD, GuitarTypes.ACOUSTIC);
        stockItem = new StockItem(guitar, 99.0, 105.0);
    }

    @Test
    public void canGetItem() { assertEquals(guitar, stockItem.getItem());
    }

    @Test
    public void canGetCostPrice() { assertEquals(99.0, stockItem.getCostPrice(),0.0);
    }

    @Test
    public void canGetRetailPrice() { assertEquals(105.0, stockItem.getRetailPrice(), 0.0);
    }

    @Test
    public void canSetRetailPrice() { stockItem.setRetailPrice(110.99);
        assertEquals(110.99, stockItem.getRetailPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(6.0, stockItem.calculateMarkup(), 0.0);
    }

    @Test
    public void itemCanBeAnAccessory(){
        accesory =  new Accesory("Drum Sticks");
        stockItem2 = new StockItem(accesory, 10.0, 15.0);
        assertEquals(accesory, stockItem2.getItem());
        assertEquals(10.0, stockItem2.getCostPrice(),0.0);
        assertEquals(15.0, stockItem2.getRetailPrice(), 0.0);
        assertEquals(5.0, stockItem2.calculateMarkup(),0.0);
        stockItem2.setRetailPrice(14.0);
        assertEquals(4.0, stockItem2.calculateMarkup(),0.0);
    }
}