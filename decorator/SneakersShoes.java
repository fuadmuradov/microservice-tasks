package org.example.decorator;

public class SneakersShoes implements Shoes{
    @Override
    public String description() {
        return "Sneakers Shoes";
    }

    @Override
    public double price() {
        return 200;
    }
}
