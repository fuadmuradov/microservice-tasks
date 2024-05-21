package org.example.decorator;

public class ClassicShoes implements Shoes{
    @Override
    public String description() {
        return "Classic Shoes";
    }

    @Override
    public double price() {
        return 100;
    }
}
