package org.example.abstractFactory.bankingApp;

import org.example.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer write Code");
    }
}
