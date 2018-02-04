package chapter16;

public class MainClass {

	public static void main(String[] args) {
		StarCarLowGrade starCarLowGrade = new StarCarLowGrade("레드","일반타이어",2000,"일반핸들");
		StarCarHighGrade starCarHighGrade = new StarCarHighGrade("블루","쩌는타이어",3000,"개쩌는핸들");
		
		starCarLowGrade.getSpec();
		starCarHighGrade.getSpec();
	}
}
