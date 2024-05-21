package org.example.decorator;

public class WhiteShoesDecorator extends ShoesDecorator {
    private Shoes shoesDecorator;

    public WhiteShoesDecorator(Shoes shoes) {
        super(shoes);
        this.shoesDecorator = shoes;
    }

    @Override
    public String description() {
        return shoesDecorator.description().concat(" - color white");
    }

    @Override
    public double price() {
        return shoesDecorator.price() + 10;
    }
}
