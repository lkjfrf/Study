package chapter17;

public class BPhone implements IFunction{

	@Override
	public void cellSenderReceive() {
		// TODO Auto-generated method stub
		System.out.println("가능 합니다.");
	}

	@Override
	public void canLite() {
		// TODO Auto-generated method stub
		System.out.println("가능 합니다. 4G임 ㅎㅎ");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("탑재 되었습니다.");
		
	}	

}
