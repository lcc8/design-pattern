package compound.impl;

import compound.Quackable;
import compound.observer.DuckSubject;
import compound.observer.Observer;
import compound.observer.QuackObservable;

public class MallarDuck implements Quackable {
    QuackObservable quackSubject;

    public MallarDuck() {
        this.quackSubject = new DuckSubject(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        quackSubject.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackSubject.notifyObservers();
    }

    @Override
    public String toString() {
        return "Mallar duck";
    }
}
