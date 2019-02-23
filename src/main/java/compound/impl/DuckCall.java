package compound.impl;

import compound.Quackable;
import compound.observer.DuckSubject;
import compound.observer.Observer;

public class DuckCall implements Quackable {
    private DuckSubject duckSubject;

    public DuckCall() {
        duckSubject = new DuckSubject(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        duckSubject.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duckSubject.notifyObservers();
    }

    @Override
    public String toString() {
        return "DuckCall Duck";
    }
}
