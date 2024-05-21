package org.example.observer;

public class Channel implements Observer{
    private String news;
    @Override
    public void update(String news) {
        this.news = news;
        displayNews();
    }

    public void displayNews(){
        System.out.println("Received an Message: "+ news);
    }
}
