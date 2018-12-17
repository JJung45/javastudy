package test;

public class Exercise7_18 {
	
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		}else if(r instanceof SingRobot) {
			SingRobot sr = (SingRobot)r;
			sr.sing();
		}else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i<arr.length; i++) {
			action(arr[i]);
		}

	}
}
	
class Robot{}
	
class DanceRobot extends Robot{
		void dance() {
			System.out.println("�����");
		}
}

class SingRobot extends Robot{
	void sing() {
		System.out.println("�뷡�Ѵ�");
	}
}

class DrawRobot extends Robot{
	void draw() {
		System.out.println("�׸��׸���");
	}
}