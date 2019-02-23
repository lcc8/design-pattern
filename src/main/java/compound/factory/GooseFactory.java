package compound.factory;

import compound.Quackable;
import compound.adapter.Goose;
import compound.adapter.GooseAdapter;

public class GooseFactory extends AbstractGooseFactory {
    @Override
    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
