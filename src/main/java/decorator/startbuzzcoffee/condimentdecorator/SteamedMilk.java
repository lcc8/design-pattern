package decorator.startbuzzcoffee.condimentdecorator;

import decorator.startbuzzcoffee.Beverage;
import decorator.startbuzzcoffee.CondimentsDecorator;

public class SteamedMilk extends CondimentsDecorator {
    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Streamed Milk";
    }
}
