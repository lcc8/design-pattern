package decorator.startbuzzcoffee.condimentdecorator;

import decorator.startbuzzcoffee.Beverage;
import decorator.startbuzzcoffee.CondimentsDecorator;

public class Mocha extends CondimentsDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
