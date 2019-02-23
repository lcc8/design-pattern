package compound.factory;

import compound.Quackable;

public abstract class AbstractDuckFactory {
    public abstract Quackable createMallerDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
