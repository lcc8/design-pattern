package state;

import static state.State.HAS_QUATER;
import static state.State.NO_QUARTER;
import static state.State.SOLD;
import static state.State.SOLD_OUT;

public class GumballMachine {
    private State state = SOLD_OUT;
    private int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if(count > 0){
            state = NO_QUARTER;
        }
    }

    public void insertQuarter(){

        switch (state){
            case HAS_QUATER:
                System.out.println("You can't insert another quarter");
                break;
            case NO_QUARTER:
                state = HAS_QUATER;
                System.out.println("You insert a quarter");
                break;
            case SOLD_OUT:
                System.out.println("You can't insert a quarter. the machine is sold out");
                break;
            case SOLD:
                System.out.println("Please wait, we're already giving you a gumball");
                break;
        }
    }

    public void ejectQuater(){
        switch (state){
            case HAS_QUATER:
                System.out.println("Quarter returned");
                state = NO_QUARTER;
                break;
            case NO_QUARTER:
                System.out.println("You haven't inserted a quarter");
                break;
            case SOLD:
                System.out.println("Sorry, you already turned the crank");
                break;
            case SOLD_OUT:
                System.out.println("You can't eject, you haven't inserted a quarter yet");
                break;
        }
    }

    public void turnCrank(){
        switch (state){
            case SOLD:
                System.out.println("Turning twice doesn't get you another gumball!");
                break;
            case NO_QUARTER:
                System.out.println("You turned but there's no quarter");
                break;
            case SOLD_OUT:
                System.out.println("You turned, but there are no gumballs");
                break;
            case HAS_QUATER:
                System.out.println("You turned...");
                state = SOLD;
                dispense();
        }
    }

    private void dispense() {
        switch (state){
            case SOLD:
                System.out.println("A gumball comes rolling out the slot");
                count--;
                if(count == 0){
                    state = SOLD_OUT;
                }else{
                    state = NO_QUARTER;
                }
                break;
            case NO_QUARTER:
                System.out.println("You need to pay first");
                break;
            case SOLD_OUT:
                System.out.println("No gumball dispensed");
                break;
            case HAS_QUATER:
                System.out.println("No gumball dispensed");
                break;
        }
    }

    @Override
    public String toString() {
        if(count > 0) {
            return "\nGumballMachineTestDrive\nMachine is waiting for quarter.\n";
        }else{
            return "\nGumballMachineTestDrive\n Machine is sold out.\n";
        }
    }
}
