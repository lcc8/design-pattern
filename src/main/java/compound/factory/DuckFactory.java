package compound.factory;

import compound.Quackable;
import compound.impl.DuckCall;
import compound.impl.MallarDuck;
import compound.impl.RedheadDuck;
import compound.impl.RubberDuck;

public class DuckFactory extends AbstractDuckFactory{
    @Override
    public Quackable createMallerDuck() {
        return new MallarDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
