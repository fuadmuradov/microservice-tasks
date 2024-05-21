package org.example.facade;

public class Xiaomi implements Shop{
    @Override
    public void modelNo() {
        System.out.println("Poco F5");
    }

    @Override
    public void price() {
        System.out.println("350$");
    }
}
