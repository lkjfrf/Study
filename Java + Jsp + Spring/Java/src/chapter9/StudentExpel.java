package chapter9;

import java.util.ArrayList;

public class StudentExpel {
	ArrayList<Student> expleStudents;

	public StudentExpel(){
		expleStudents = new ArrayList<Student>();
	}
	
	public void addExpelStudent(String name, int age, int studentNum, String major) {
		expleStudents.add(new Student(name,age,studentNum,major));
		System.out.println("재적 학생 정보 등록완료");
		
	}
}
