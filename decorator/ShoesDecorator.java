package org.example.decorator;

public class ShoesDecorator implements Shoes{
    private Shoes shoes;
    public ShoesDecorator(Shoes shoes){
        this.shoes = shoes;
    }

    @Override
    public String description() {
        return shoes.description();
    }

    @Override
    public double price() {
        return shoes.price();
    }
}
