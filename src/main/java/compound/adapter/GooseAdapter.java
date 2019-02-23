package compound.adapter;

import compound.Quackable;
import compound.observer.DuckSubject;
import compound.observer.Observer;
import compound.observer.QuackObservable;

public class GooseAdapter implements Quackable {
    QuackObservable quackObservable;

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        quackObservable = new DuckSubject(this);
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {
        quackObservable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackObservable.notifyObservers();
    }
}
