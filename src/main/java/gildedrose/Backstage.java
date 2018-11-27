package gildedrose;

public class Backstage extends Item{

    public Backstage(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    public Backstage() {
        super();
        this.name ="Backstage passes to a TAFKAL80ETC concert";
        this.sellIn = 15;
        this.quality = 20;
    }
}
