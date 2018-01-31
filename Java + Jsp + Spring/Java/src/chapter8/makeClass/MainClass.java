package chapter8.makeClass;

import chapter8.makeHuman.Man;
import chapter8.makeHuman.Woman;

public class MainClass {
	public static void main(String[] args) {			//맨처음 JVM이 실행시키는 메소드  (이안에서 이루어짐)
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
