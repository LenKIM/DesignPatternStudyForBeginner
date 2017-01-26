package gumballstate;

/**
 * Created by len on 2017. 1. 26..
 */
public class HasQuarterState implements State {

    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuater() {
        System.out.println("또다른 동전을 넣을 수 없습니다");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("동전을 반환합니다");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("동전을 돌립니다");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
//        알맹이가 배출시에 해야 할 일.
        System.out.println("나갈 동전이 없습니다.");
    }

    public String toString() {
        return "다른 행동을 기다려주세요.";
    }
}
