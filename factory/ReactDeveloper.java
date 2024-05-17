package org.example.factory;

import org.example.factory.Developer;

public class ReactDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("React Developer");
    }
}
