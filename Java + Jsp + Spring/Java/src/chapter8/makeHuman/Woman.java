package chapter8.makeHuman;

public class Woman {

	public Woman() {			//안만들어도 컴파일러가 저절로 만들어줌
		// TODO Auto-generated constructor stub
	}
	
	public Woman(int privatee, int privateee) {
		// TODO Auto-generated constructor stub
	}
	
	public boolean hello() {
		
		boolean result = 1 == 2;
		return result;
		
	}
	
	
	int publicc;				//생략하면 public 으로 만들어짐
	public int publiccc;
	private int privatee;			//인스턴스 변수
	private int privateee;
	
	
	public int getPublicc() {
		return publicc;
	}

	public void setPublicc(int publicc) {
		this.publicc = publicc;
	}

	public int getPrivatee() {
		
		privatee = 22;
		return privatee;
	}

	public void setPrivatee(int privatee) {
		this.privatee = privatee;
	}

	
	
	
}
