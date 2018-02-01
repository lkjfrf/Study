package chapter9;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {				// JVM이 밖이아닌  void main(String[] args)부터 시작하므로 
		StudentManager manager = new StudentManager();				// 밖에 있는 StudentManager 객체를 만들어줘야 StudentManager(클래스)를 사용가능
		manager.addStudent("홍길동",22,20180201,"연극영화");			//manager객체 = StudentManager클래스 를 사용해서 manager객체안에있는 addStudent를 사용해서 값들 넣음
		manager.addStudent("송우현",21,20080201,"컴퓨터");
		manager.addStudent("우왕굳",24,20680201,"수학");
		manager.addStudent("흐앵",30,20180201,"국어");
		
		System.out.println(manager.students.get(0).getName());		// students의 첫번째 객체의 이름을 get함
	}
	
	private void addStudent(String name, int age, int studentNum, String major ) {		//파라미터 값들을 가지고 
		Student student = new Student(name,age,studentNum,major);		// 학생한명의 객체를 생성함
		students.add(student);											// 그리고 그 객체를 students객체 = ArrayList<Student> 배열에 차곡차곡 쌓음
		System.out.println( name + " 학생 정보 입력 성공");
		
	}
}
