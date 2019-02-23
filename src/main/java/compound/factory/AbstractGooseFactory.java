package compound.factory;

import compound.Quackable;
import compound.adapter.Goose;

public abstract class AbstractGooseFactory {
    public abstract Quackable createGooseDuck();
}
