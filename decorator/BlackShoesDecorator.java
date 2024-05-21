package org.example.decorator;

public class BlackShoesDecorator extends ShoesDecorator{
    private Shoes shoesDecorator;
    public BlackShoesDecorator(Shoes shoes) {
        super(shoes);
        this.shoesDecorator = shoes;
    }
    @Override
    public String description() {
        return shoesDecorator.description().concat(" - color black");
    }

    @Override
    public double price() {
        return shoesDecorator.price()+10;
    }
}
