package gildedrose;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    protected  Item it;

    @Before
    public void setUp() {
        it=new Item("Mhmd",1,1);
    }
    @org.junit.Test
    public void getName() { it.getName();
    }

    @org.junit.Test
    public void setName() {
        it.setName("Isml");
    }

    @org.junit.Test
    public void getSellIn() {
        it.getSellIn();
    }

    @org.junit.Test
    public void setSellIn() {
        it.setSellIn(0);
    }

    @org.junit.Test
    public void getQuality() {
        it.getQuality();
    }

    @org.junit.Test
    public void setQuality() {
        it.setQuality(0);
    }
}

