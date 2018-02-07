package chapter20.robot;

import chapter20.robot2.IFly;
import chapter20.robot2.IKnife;
import chapter20.robot2.IMisail;

public abstract class Robot {
	
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionWalk() {
		// TODO Auto-generated method stub
		System.out.println("걸을 수 있습니다.");
	}
	public void actionRun() {
		// TODO Auto-generated method stub
		System.out.println("달릴 수 있습니다.");
	}
	public abstract void shape();
	
	
	
	
//	public abstract void actionFly();			// Robot을 상속받은 로봇들은 앞으로 abstract대로 기능을 재정의 해줘야 합니다.(까먹지 못하도록)
//	
//	public abstract void actionMisail();
//	
//	public abstract void actionKnife();			// 인터페이스로 다 바꿔서 필요없음
	
	
	
	
	
//	IFly fly = new FlyYes();
//	IMisail misail = new MisailYes();
//	IKnife knife = new KnifeLazzer();				// 이렇게 한번에 정해주던가
	
	IFly fly;
	IMisail misail;
	IKnife knife;
	
	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setMisail(IMisail misail) {
		this.misail = misail;
	}

	public void setKnife(IKnife knife) {
		this.knife = knife;
	}												// 이렇게 게터를 이용하여 정해줄 수 있음
	
	
	
	public void actionFly() {
		// TODO Auto-generated method stub
		this.fly.IFly();
	}
	public void actionMisail() {
		// TODO Auto-generated method stub
		this.misail.IMisail();
	}
	public void actionKnife() {
		// TODO Auto-generated method stub
		this.knife.IKnife();
	}
	

}
