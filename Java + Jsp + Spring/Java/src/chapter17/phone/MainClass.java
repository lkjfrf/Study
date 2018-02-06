package chapter17.phone;

public class MainClass {
	public static void main(String[] args) {
//		APhone aPhone = new APhone();
//		BPhone bPhone = new BPhone();
//		CPhone cPhone = new CPhone();			전에는 이렇게 만들어서 사용했지만
		
		IFunction aPhone = new APhone(); 		//이제는 인터페이스를 객체타입으로 이용하여 객체생성 가능
		IFunction bPhone = new BPhone();
		IFunction cPhone = new CPhone();	
		
		IFunction[] ifunctions = {aPhone,bPhone,cPhone};	// {}안의 객체들이 배열이 될 수 있는 이유는 모두 IFunction으로 같은 데이터타입으로 만들어 졌기 때문에
															// IFunction[] 타입으로 배열이 됨
		for(int i=0; i < ifunctions.length; i++) {
			ifunctions[i].cellSenderReceive();
			ifunctions[i].canLite();
			ifunctions[i].tvRemoteController();
			System.out.println("==========");
		}												// for문이 가능한 이유도 IFunction으로 타입을 맞췄기 때문
	}    
}        
