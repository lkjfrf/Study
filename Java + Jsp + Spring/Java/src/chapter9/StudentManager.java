package chapter9;

import java.util.ArrayList;

public class StudentManager {
	
	ArrayList<Student> students = new ArrayList<Student>();
	StudentExpel studentExpel = new StudentExpel();
	
	public static void main(String[] args) {				// JVM�� ���̾ƴ�  void main(String[] args)���� �����ϹǷ� 
		StudentManager manager = new StudentManager();				// �ۿ� �ִ� StudentManager ��ü�� �������� StudentManager(Ŭ����)�� ��밡��
		manager.addStudent("ȫ�浿",22,20180201,"���ؿ�ȭ");			//manager��ü = StudentManagerŬ���� �� ����ؼ� manager��ü�ȿ��ִ� addStudent�� ����ؼ� ���� ����
		manager.addStudent("�ۿ���",21,20080201,"��ǻ��");
		manager.addStudent("��ձ�",24,20680201,"����");
		manager.addStudent("���",30,20180201,"����");
		
		System.out.println(manager.students.get(0).getName());		// students�� ù��° ��ü�� �̸��� get��
	}
	
	private void addStudent(String name, int age, int studentNum, String major ) {		//�Ķ���� ������ ������ 
		Student student = new Student(name,age,studentNum,major);		// �л��Ѹ��� ��ü�� ������
		students.add(student);											// �׸��� �� ��ü�� students��ü = ArrayList<Student> �迭�� �������� ����
		System.out.println( name + " �л� ���� �Է� ����");
		
	}
}
