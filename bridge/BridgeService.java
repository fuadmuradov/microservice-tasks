package org.example.bridge;

public class BridgeService {
    public static void main(String[] args) {
        var circle = new Circle(new RedColor());
        var square = new Square(new BlueColor());
        square.applyColor();
        circle.applyColor();
    }
}
