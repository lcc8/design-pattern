package compound;

import compound.composite.Flock;
import compound.factory.AbstractDuckFactory;
import compound.factory.AbstractGooseFactory;
import compound.factory.CountingDuckFactory;
import compound.factory.GooseFactory;
import compound.impl.QuackCounter;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractGooseFactory gooseFactory = new GooseFactory();
        duckSimulator.simulate(duckFactory, gooseFactory);
    }

    private void simulate(AbstractDuckFactory abstractDuckFactory, AbstractGooseFactory abstractGooseFactory) {
        Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
        Quackable duckCall = abstractDuckFactory.createDuckCall();
        Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
        Quackable gooseDuck = abstractGooseFactory.createGooseDuck();

        System.out.println("\nDuck Simulator: With Decorator, Factory, Composite - Flocks\n");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

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

        System.out.println("\nDuck Simulator: Whole Flock Simulation\n");
        simulate(flockOfDucks);

        System.out.println("\nDuck Simulator: Mallard Flock Simulation\n");
        simulate(flockOfMallards);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
