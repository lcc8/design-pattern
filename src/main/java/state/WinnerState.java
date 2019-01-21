package state;

public class WinnerState implements State {
    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert a quarter at this point.");
    }

    @Override
    public void ejectQuater() {
        System.out.println("You can't eject a quarter at this point.");
    }

    @Override
    public void turnCrank() {
        System.out.println("You can't turn crank at this point.");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();

        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            System.out.println("YOU ARE A WINNER! You got 2 gumballs for your quarter");
            if(gumballMachine.getCount() > 0 ){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else {
                System.out.println("Opps, out of gumball");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public void refill() {
        System.out.println("still ball, can't refill");
    }
}
