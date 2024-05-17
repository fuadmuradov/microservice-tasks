package org.example.abstractFactory.webSiteApp;

import org.example.abstractFactory.Developer;

public class KotlinDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Kotlin Developer write code");
    }
}
