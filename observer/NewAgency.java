package org.example.observer;

public class NewAgency extends Subject{
    private String news;

    public void setNews(String news){
        this.news = news;
        notifyObserver(news);
    }

    public String getNews(){
        return this.news;
    }

}
