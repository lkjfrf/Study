package chapter20.robot;

import chapter20.robot2.FlyYes;
import chapter20.robot2.KnifeLazzer;
import chapter20.robot2.MisailYes;

public class MainClass {
	public static void main(String[] args) {
		
		System.out.println("슈퍼로봇을 만들어 주세요");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		
		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
		superRobot.setKnife(new KnifeLazzer());
		superRobot.actionKnife();
		superRobot.setMisail(new MisailYes());
		superRobot.actionMisail();
		
	}

}
