package test;

public class Exercise9_4 {
	
	static void printGraph(int[] dataArr, char ch) {
		for(int i=0; i<dataArr.length; i++) {
			for(int k=0; k<dataArr[i]; k++) {
				System.out.print(ch);
			}
			System.out.println(dataArr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printGraph(new int[] {3,7,1,4,},'*');
	}

}
