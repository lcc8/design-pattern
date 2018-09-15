package decorator.startbuzzcoffee.condimentdecorator;

import decorator.startbuzzcoffee.Beverage;
import decorator.startbuzzcoffee.CondimentsDecorator;

public class Whip extends CondimentsDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
