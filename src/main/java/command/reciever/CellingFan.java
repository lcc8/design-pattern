package command.reciever;

public class CellingFan {

    private String location;
    private int speed;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CellingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("Fan is high");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("Fan is medium");
    }

    public void low() {
        speed = LOW;
        System.out.println("Fan is low");
    }

    public void off() {
        speed = OFF;
        System.out.println("Fan is off");
    }

    public int getSpeed() {
        return speed;
    }

}
