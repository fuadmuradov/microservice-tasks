package org.example.factory;

public class ReactDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new ReactDeveloper();
    }
}
