package chapter17.xman;

public class MainClass {
	
	public static void main(String[] args) {
		
		Actress actress = new Actress();
		actress.canCatchCriminal();
		actress.canSearch();
		actress.outFire();
		actress.saveMan();
		actress.makePizza();
		actress.makeSpaghetti();
		
		PoliceMan actressP = new Actress();
		actressP.canCatchCriminal();
		actressP.canSearch();
		
//		actressP.outFire();				//타입을 폴리스로 했기 때문에 사용불가능
//		actressP.saveMan();
//		actressP.makePizza();
//		actressP.makeSpaghetti();
		
		Firefighter actressF = new Actress();
		actressF.outFire();
		actressF.saveMan();
		
//		actressF.canCatchCriminal();
//		actressF.canSearch();
//		actressF.makePizza();
//		actressF.makeSpaghetti();
		
	}
	
}
