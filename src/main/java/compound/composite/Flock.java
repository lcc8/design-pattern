package compound.composite;

import compound.Quackable;
import compound.observer.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {

    ArrayList<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker){
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();

        while(iterator.hasNext()){
            Quackable quaker = iterator.next();
            quaker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = quackers.iterator();

        while(iterator.hasNext()){
            Quackable quackable = iterator.next();
            quackable.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
        Iterator<Quackable> iterator = quackers.iterator();

        while(iterator.hasNext()){
            Quackable quackable = iterator.next();
            quackable.notifyObservers();
        }
    }
}
