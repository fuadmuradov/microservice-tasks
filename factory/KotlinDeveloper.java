package org.example.factory;

import org.example.factory.Developer;

public class KotlinDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Kotlin Developer");
    }
}
