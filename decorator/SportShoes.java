package org.example.decorator;

public class SportShoes implements Shoes{
    @Override
    public String description() {
        return "Sport Shoes";
    }

    @Override
    public double price() {
        return 300;
    }
}
