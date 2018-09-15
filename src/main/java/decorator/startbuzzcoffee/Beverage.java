package decorator.startbuzzcoffee;

public abstract class Beverage {

    public enum Size {
        TALL, GRANDE, VENTI
    }

    private Size size = Size.TALL;

    protected String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return size.toString() + " " + description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}
