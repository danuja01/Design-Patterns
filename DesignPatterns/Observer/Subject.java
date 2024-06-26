package DesignPatterns.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObserver();
    void setStatus(String status);
}
