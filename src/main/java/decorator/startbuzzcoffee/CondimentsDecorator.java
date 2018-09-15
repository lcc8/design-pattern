package decorator.startbuzzcoffee;

public abstract class CondimentsDecorator extends Beverage {

    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize(){
        return beverage.getSize();
    }
}
