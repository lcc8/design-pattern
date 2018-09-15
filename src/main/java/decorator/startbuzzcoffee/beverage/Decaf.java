package decorator.startbuzzcoffee.beverage;

import decorator.startbuzzcoffee.Beverage;

public class Decaf extends Beverage {
    public Decaf() {

        description = "Decaf Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
