package state;

public interface State {
    void insertQuarter();
    void ejectQuater();
    void turnCrank();
    void dispense();
    void refill(int count);
}
