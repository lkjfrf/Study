package chapter15;

public class Child1 extends LunchMenu {
	
	public Child1(int rice, int bulgogi, int banana, int milk, int almond) {
		// TODO Auto-generated constructor stub
		super(rice, bulgogi, banana, milk, almond);
	}
	
	@Override
	public int calculating() {
		// TODO Auto-generated method stub
		return rice + bulgogi + banana;
	}

}
