package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Exercise10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		for(int i=0; i<12; i++) {
			sDay.set(2010, i, 1);
			eDay.set(2010, i+1, 1);
			eDay.add(Calendar.DATE, -1);
			START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
			END_DAY = eDay.get(Calendar.DATE);
			
			for(int k=1, n=START_DAY_OF_WEEK; k<END_DAY; i++,k++) {
			
				if(Calendar.DAY_OF_WEEK==1 && Calendar.DAY_OF_MONTH==2) {
					
					Calendar today = Calendar.getInstance();
					today.set(2014,i,k);
					
					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
					SimpleDateFormat df2 = new SimpleDateFormat("F번째 E요일입니다.");
					
					System.out.println(df.format(today)+"은 "+df2.format(today));
				}
			}
		}
		

	}

}
