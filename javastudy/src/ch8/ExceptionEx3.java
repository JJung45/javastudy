package ch8;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		int result=0;
		
		for(int i=0; i<10; i++) {
			try {
				result = num/(int)(Math.random()*10);
				System.out.println(result);
			}catch(ArithmeticException e) {
				System.out.println("0");
			}
		}

	}

}
