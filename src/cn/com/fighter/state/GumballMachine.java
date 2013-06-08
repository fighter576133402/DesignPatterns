package cn.com.fighter.state;

public class GumballMachine {
	State soldOutState;//�ǹ��۾�
	State noQuarterState;//û��25��Ǯ
	State hasQuarterState;//��25��Ǯ
	State soldState;//�۳��ǹ�
	State winnerState;
	
	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}

	State state = soldOutState;
	int count = 0;
	
	public GumballMachine(int numberGumballs){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if(numberGumballs > 0 ){
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}
	/**
	 * ��������ṩ����������������ͷ��ǹ�������countʵ��������ֵ��1
	 */
	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if(count != 0 ){
			count = count -1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getState() {
		return state;
	}
	
	public void reFill(int count){
		this.count = count;
		state = noQuarterState;
	}
	
	
}
