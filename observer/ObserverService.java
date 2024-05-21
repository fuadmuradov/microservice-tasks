package org.example.observer;

public class ObserverService {
    public static void main(String[] args) {
        NewAgency newAgency = new NewAgency();

        for (int i = 0; i<5; i++){
            newAgency.addObservers(new Channel());
        }

        newAgency.setNews("Canada");

    }
}
