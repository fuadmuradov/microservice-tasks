package org.example.facade;

public class Iphone implements Shop{
    @Override
    public void modelNo() {
        System.out.println("Iphone X");
    }

    @Override
    public void price() {
        System.out.println("1200$");
    }
}
