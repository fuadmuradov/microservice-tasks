package org.example.bridge;

public class Square extends Shape{

    public Square(Color color){
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Shape Color: ");
        color.printColor();
    }
}
