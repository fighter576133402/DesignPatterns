package cn.com.fighter.proxy;

public class NoQuarterState implements State {
	transient GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	/**
	 * 如果有人投了25分钱我们就打印出一条消息说我们接受了25分钱，然后改变机器的状态到HasQuarterState
	 */
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You insert a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	/**
	 * 如果没给钱就不能要求退钱
	 */
	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You haven't insert a quarter");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned , but there's no quarter");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("You need to pay first");
	}

}
