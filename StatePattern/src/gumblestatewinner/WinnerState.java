package gumblestatewinner;

/**
 * Created by len on 2017. 1. 26..
 */
public class WinnerState implements gumblestatewinner.State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("Please wait, we're already giving you a Gumball");

    }

    public void ejectQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void turnCrank() {
        System.out.println("Turning again doesn't get you another gumball!");
    }

    public void dispense() {

        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldQutState());
        } else {
            gumballMachine.releseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldQutState());
            }
        }
    }


}
