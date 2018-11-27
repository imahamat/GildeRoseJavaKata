package gildedrose;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;


public class InventoryTest {
    protected Inventory inv;
    protected Item[] ancienneListeDesItems;
    @Before
    public void setUp()  {
        inv = new Inventory();
        ancienneListeDesItems = inv.getItems();
    }
    @After
    public  void TearDown() {
    }
    @org.junit.Test
    public void printInventory() {
    }
    @org.junit.Test
    public void updateQuality() throws Exception{
     inv.updateQuality();
     Item[] items = inv.getItems();
        for (int i =0;i<items.length; i++) {
            if(ancienneListeDesItems[i].getSellIn()==0)
            {
                assertEquals(ancienneListeDesItems[i].getQuality()-2,items[i].getQuality());
            }
        }
    }


}