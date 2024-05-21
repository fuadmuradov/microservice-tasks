package org.example.decorator;

public class RedShoesDecorator extends ShoesDecorator{
    private Shoes shoesDecorator;
    public RedShoesDecorator(Shoes shoes) {
        super(shoes);
        this.shoesDecorator = shoes;
    }
    @Override
    public String description() {
        return shoesDecorator.description().concat(" - color red");
    }

    @Override
    public double price() {
        return shoesDecorator.price()+10;
    }
}
