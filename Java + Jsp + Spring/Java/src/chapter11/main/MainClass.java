package chapter11.main;

import chapter11.children.*;
import chapter11.pouch.Pouch;

public class MainClass {
	
	public static void main(String[] args) {
		
		First first = new First();
		first.takeMoney(100);
		
		Second second = new Second();
		second.takeMoney(100);
		
		Third third= new Third();
		third.takeMoney(100);
		
		System.out.println("���� : " + Pouch.MONEY);			// Pouch.MONEY �� static �����̹Ƿ� �ٷ� ���� ����
	}

}
