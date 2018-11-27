package gildedrose;

public class ConjuredManaCake extends Item{

    public ConjuredManaCake(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    public ConjuredManaCake() {
        super();
        this.name ="Conjured Mana Cake";
        this.sellIn = 3;
        this.quality = 6;
    }
}

