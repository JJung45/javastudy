package test;

public class Exercise5_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if(args.length!=1) {
			System.out.println("USAGE: java Exercise5_7 3120");
			System.exit(0);
		}
		
		int money = Integer.parseInt(args[0]);
		
		System.out.println("money="+money);
		
		int[] coinUint = {500,100,50,10};
		int[] coin = {5,5,5,5};
		
		for(int i =0; i<coinUint.length; i++){
			int coinNum = 0;
			
			coinNum = money/coinUint[i];
			
			if(coin[i]>=coinNum) {
				coin[i]=coin[i]-coinNum;
			}else {
				coinNum = coin[i];//틀림
				coin[i]=0;
			}			
			money = money-coinUint[i]*coinNum;
			
			System.out.println(coinUint[i]+"원: "+coinNum);
		}
		
		if(money>0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		
		System.out.println("==남은 동전의 개수==");
		
		for(int i=0; i<coinUint.length;i++) {
			System.out.println(coinUint[i]+"원: "+coin[i]);
		}

	}

}
