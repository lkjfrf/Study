package chapter13;

public class ChildClass extends ParentClass {

	@Override									// ParentClass 의 method1을 재정의(override)해서 주석같이 표시해줌 - 표시안하면 나중에 틀렸을때 에러 잘 알려주지 못함
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Child method1");
	}
	
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Child method3");
	}
}
