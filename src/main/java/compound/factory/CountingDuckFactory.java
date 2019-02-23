package compound.factory;

import compound.Quackable;
import compound.impl.DuckCall;
import compound.impl.MallarDuck;
import compound.impl.QuackCounter;
import compound.impl.RedheadDuck;
import compound.impl.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallerDuck() {
        return new QuackCounter(new MallarDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
