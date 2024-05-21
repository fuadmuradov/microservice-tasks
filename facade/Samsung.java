package org.example.facade;

public class Samsung implements Shop{
    @Override
    public void modelNo() {
        System.out.println("S22 Ultra");
    }

    @Override
    public void price() {
        System.out.println("800$");
    }
}
