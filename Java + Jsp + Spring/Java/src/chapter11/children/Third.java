package chapter11.children;

import chapter11.pouch.Pouch;

public class Third {
	
	/*public Third() {
		// TODO Auto-generated constructor stub
	}*/													//���� �ȸ��� �ڵ����� �������
	
	public void takeMoney(int money) {
		//Pouch pouch = new Pouch();				//static��ü�� �ȸ��� ��
		Pouch.MONEY = Pouch.MONEY - money;			// pouch ��ü�� ������ �ʰ� �ٷ� ���
		
		if(Pouch.MONEY < 0) {
			System.out.println("ù°�� ���� ���޾ƿ� �̤�");
		}
		
		System.out.println("��°�� " + money + "�� �� ������ "+ Pouch.MONEY + "��ŭ ���Ҵ�.");
		
		
	}

}
