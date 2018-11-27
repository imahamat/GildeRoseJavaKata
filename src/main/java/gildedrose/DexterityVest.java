package gildedrose;

public class DexterityVest extends Item {

    public DexterityVest(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    public DexterityVest() {
        super();
        this.name ="+5 Dexterity Vest";
        this.sellIn = 10;
        this.quality = 20;
    }
}
