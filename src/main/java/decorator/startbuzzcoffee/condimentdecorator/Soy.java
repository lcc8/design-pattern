package decorator.startbuzzcoffee.condimentdecorator;

import decorator.startbuzzcoffee.Beverage;
import decorator.startbuzzcoffee.CondimentsDecorator;

public class Soy extends CondimentsDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double sizePrice;
        switch(getSize()){
            case TALL:
                sizePrice = 0.1;
                break;
            case GRANDE:
                sizePrice = 0.15;
                break;
            case VENTI:
                sizePrice = 0.2;
                break;
            default:
                sizePrice = 0;
                break;
        }

        return beverage.cost() + 0.15 + sizePrice;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
