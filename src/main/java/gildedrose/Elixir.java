package gildedrose;

public class Elixir extends Item{

    public Elixir(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    public Elixir() {
        super();
        this.name ="Elixir of the Mongoose";
        this.sellIn = 5;
        this.quality = 7;
    }
}
