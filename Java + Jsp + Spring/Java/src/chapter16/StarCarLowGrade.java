package chapter16;

public class StarCarLowGrade extends StarCar {
	private int tax = 1000;
	
	public StarCarLowGrade(String color, String tire, int displacement, String handle) {
		// TODO Auto-generated constructor stub
		super(color, tire, displacement, handle);
		
	}
	
	@Override
	public void getSpec() {
		// TODO Auto-generated method stub
		System.out.println("*************************");
		System.out.println(color);				// StarCarLowGrade 클래스에 color 값이 정의 안됬으므로 부모에서 찾음
		System.out.println(tire);
		System.out.println(displacement);
		System.out.println(handle);
		if(displacement > 2000) {
			tax = 1500;
		}
		System.out.println("세금 : "+ tax);
		System.out.println("*************************");

	}

	
}
