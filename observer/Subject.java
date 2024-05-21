package org.example.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObservers(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    protected void notifyObserver(String news){
        for (Observer observer: observers) {
            observer.update(news);
        }
    }
}
