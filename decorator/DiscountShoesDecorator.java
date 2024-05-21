package org.example.decorator;

public class DiscountShoesDecorator extends ShoesDecorator{
    private Shoes shoes;
    private double discount;
    public DiscountShoesDecorator(Shoes shoes, double discount) {
        super(shoes);
        this.shoes = shoes;
        this.discount = discount;
    }
    @Override
    public String description() {
        return shoes.description().concat("- discount applied");
    }

    @Override
    public double price() {
        return shoes.price()-discount;
    }
}
