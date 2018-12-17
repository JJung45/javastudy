package test;

public class Exercise5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] star= {
			{'*','*',' ',' ',' '},
			{'*','*',' ',' ',' '},
			{'*','*','*','*','*'},
			{'*','*','*','*','*'},
		};
		
		char[][] result = new char[star[0].length][star.length];
		
		for(int i=0; i<star.length; i++) {
			for(int j=0; j<star[i].length; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int k=0; k<star.length; k++) {
			for(int l=0; l<star[k].length; l++) {
				int x=l;
				int y= star.length-1-k;
				
				result[x][y]=star[k][l];
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}

	}

}
