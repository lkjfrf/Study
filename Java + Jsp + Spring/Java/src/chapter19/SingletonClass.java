package chapter19;

public class SingletonClass {

	private static SingletonClass SINGLETON_CLASS_INSTANCE = new SingletonClass();
	public int i = 10;
	
	// 	이번 chapter19는 싱글턴 패턴을 공부하는 챕터로 
	//	클래스 하나에 하나의 객체만을 생성하여 모든 곳에서 하나의 객체만 접근 할 수 있도록 하는 방식이다.
	
	private SingletonClass() {							// 디폴트 생성자가 Private 이라면 내부에서만 객체를 생성 할 수 있음 = 외부에서는 SingletonClass 객체를 만들 수 없음
		// TODO Auto-generated constructor stub
	}
	
	public static SingletonClass getSingletonClass() {		// 위에서 Private으로 외부에서 객체를 만들 수 없게 하였기 때문에 static(모두 공유)형식으로 getSingletonClass을 통하여 SingletonClass 객체를 만들 수 있음
		
		if(SINGLETON_CLASS_INSTANCE == null) {				// 인스턴스가  없다면 생성
			SINGLETON_CLASS_INSTANCE = new SingletonClass();
		}
		
		return SINGLETON_CLASS_INSTANCE;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
	
}
