package state;

public class GumballMachine {
    private State noQuarterState;
    private State hasQuarterState;
    private State soldOutState;
    private State soldState;
    private State winnerState;

    private State state;
    private int count;

    public GumballMachine(int numberOfGum) {
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldState(this);
        soldState = new SoldState(this);

        this.count = numberOfGum;

        if(count > 0){
            state = noQuarterState;
        }else{
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuater();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot");
        if(count != 0) {
            count--;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        if(count > 0 ) {
            return "\nWe have " + count + " balls, waiting got quarter\n";
        }else{
            return "\nRun out balls.\n";
        }
    }
}
