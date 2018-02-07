package chapter20.robot;

public class SuperRobot extends Robot{
	
	public SuperRobot() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		System.out.println("슈퍼러봇입니다. 팔,다리,몸통,머리 가 있습니다.");
	}
	
//	IFly fly = new FlyYes();
//	IMisail misail = new MisailYes();
//	IKnife knife = new KnifeLazzer();				// 이렇게 한번에 정해주던가
	
//	IFly fly;
//	IMisail misail;
//	IKnife knife;
//	
//	public void setFly(IFly fly) {
//		this.fly = fly;
//	}
//
//	public void setMisail(IMisail misail) {
//		this.misail = misail;
//	}
//
//	public void setKnife(IKnife knife) {
//		this.knife = knife;
//	}												// 이렇게 게터를 이용하여 정해줄 수 있음
//													// 로봇3개 모두 중복되므로 Robot에 넣어줌
		

//	@Override
//	public void actionFly() {
//		// TODO Auto-generated method stub
//		System.out.println("날 수 있습니다.");
//	}
//
//	@Override
//	public void actionMisail() {
//		// TODO Auto-generated method stub
//		System.out.println("미사일을 쏠 수 있습니다.");
//	}
//
//	@Override
//	public void actionKnife() {
//		// TODO Auto-generated method stub
//		System.out.println("레이저검을 가지고 있습니다.");
//	}												// 인터페이스로 모두 만들어 놔서 필요없음

}
