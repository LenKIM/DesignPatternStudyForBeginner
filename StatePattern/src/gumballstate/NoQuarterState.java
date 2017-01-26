package gumballstate;

/**
 * Created by len on 2017. 1. 26..
 */
public class NoQuarterState implements State {

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("동전을 넣었음");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 넣어줘요");

    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 넣어달라고");
    }

    @Override
    public void dispense() {
        System.out.println("동전을 안넣어줄꺼니");
    }
}
