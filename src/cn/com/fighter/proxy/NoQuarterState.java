package cn.com.fighter.proxy;

public class NoQuarterState implements State {
	transient GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	/**
	 * �������Ͷ��25��Ǯ���Ǿʹ�ӡ��һ����Ϣ˵���ǽ�����25��Ǯ��Ȼ��ı������״̬��HasQuarterState
	 */
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You insert a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	/**
	 * ���û��Ǯ�Ͳ���Ҫ����Ǯ
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
