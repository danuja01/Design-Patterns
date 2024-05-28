package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    private List<Observer> observers;
    private String status;

    public SubjectImpl() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }
}
