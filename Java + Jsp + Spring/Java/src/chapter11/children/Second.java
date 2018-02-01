package chapter11.children;

import chapter11.pouch.Pouch;

public class Second {
	
	
	public Second() {
		// TODO Auto-generated constructor stub
	}
	
	public void takeMoney(int money) {
		//Pouch pouch = new Pouch();				//static객체는 안만들어도 됨
		Pouch.MONEY = Pouch.MONEY - money;			// pouch 객체를 만들지 않고 바로 사용
		
		if(Pouch.MONEY < 0) {
			System.out.println("첫째는 돈을 못받아요 ㅜㅜ");
		}
		
		System.out.println("둘째는 " + money + "를 얻어서 지갑에 "+ Pouch.MONEY + "만큼 남았다.");
		
		
	}

}
