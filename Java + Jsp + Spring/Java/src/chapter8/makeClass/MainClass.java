package chapter8.makeClass;

import chapter8.makeHuman.Man;
import chapter8.makeHuman.Woman;

public class MainClass {
	public static void main(String[] args) {			//��ó�� JVM�� �����Ű�� �޼ҵ�  (�̾ȿ��� �̷����)
		Man mc = new Man();
		Man mc1 = new Man();
		
		System.out.println(mc.equals(mc1));
		
		
		Woman wc = new Woman();
		Woman wc1 = new Woman(15,800);
		
		
		wc.getPublicc();
		wc.setPublicc(12);
		int p = wc.getPrivatee();
		wc.setPrivatee(21);
		
		System.out.println(p);
		boolean b = wc.hello();
		System.out.println(b);
		System.out.println(wc.hello());
		
	}
}
