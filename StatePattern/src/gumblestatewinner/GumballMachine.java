package gumblestatewinner;

/**
 * Created by len on 2017. 1. 26..
 */
public class GumballMachine {

    State soldQutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    public State getWinnerState() {
        return winnerState;
    }

    State state = soldQutState;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldQutState = new SoldQutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs >  0){
            state = noQuarterState;
        }

    }

    public void insertQuarter() {
        state.insertQuater();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }


    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    void releseBall(){
        System.out.println("A gumball comes rolling out the slot,,,");
        if (count != 0) {
            count = count - 1;
        }
    }

    public int getCount() {
        return count;
    }

    public State getSoldQutState() {
        return soldQutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
}
