package com.design.patterns.observer.assignment;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
    private List<Observer> observers=new ArrayList<>();
    private String channelName;
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(var observer:observers){
            observer.update(channelName+" "+status);
        }
    }
}
