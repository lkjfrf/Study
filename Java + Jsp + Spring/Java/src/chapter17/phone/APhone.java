package chapter17.phone;

public class APhone implements IFunction{			// implements를 이용하여 인터페이스 연결,   implements는 abstract와 달리 여러개를 할 수 있음

	@Override
	public void cellSenderReceive() {
		// TODO Auto-generated method stub
		System.out.println("가능 합니다.");
	}

	@Override
	public void canLite() {
		// TODO Auto-generated method stub
		System.out.println("불가능 합니다. 3G임 ㅎㅎ");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
		System.out.println("미탑재 되었습니다.");
		
	}			

}