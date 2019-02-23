package compound;

import compound.composite.Flock;
import compound.factory.AbstractDuckFactory;
import compound.factory.AbstractGooseFactory;
import compound.factory.CountingDuckFactory;
import compound.factory.GooseFactory;
import compound.impl.QuackCounter;
import compound.impl.RedheadDuck;
import compound.observer.Quackologist;

public class DuckSimulatorObserver {

    public static void main(String[] args) {
        DuckSimulatorObserver duckSimulator = new DuckSimulatorObserver();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory abstractDuckFactory) {
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallarDuck = abstractDuckFactory.createMallerDuck();
        Quackable mallarDuck2 = abstractDuckFactory.createMallerDuck();
        Quackable mallarDuck3 = abstractDuckFactory.createMallerDuck();
        Quackable mallarDuck4 = abstractDuckFactory.createMallerDuck();

        flockOfMallards.add(mallarDuck);
        flockOfMallards.add(mallarDuck2);
        flockOfMallards.add(mallarDuck3);
        flockOfMallards.add(mallarDuck4);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer\n");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
