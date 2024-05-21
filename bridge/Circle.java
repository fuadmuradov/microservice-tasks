package org.example.bridge;

public class Circle extends Shape{

    public Circle(Color color){
        super(color);
    }

    @Override
    void applyColor() {
        System.out.print("Circle Color is: ");
        color.printColor();
    }
}
