package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student implements Comparable{
	String name;
	int ban;
	int no;
	int kor, eng, math;
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	int getTotal() {
		return kor+eng+math;
	}
	
	float getAverage() {
		return (int)((getTotal()/3f)*10+0.5)/10f;
	}
	
		public String toString() {
		return name+","+ban+","+no+","+kor     +","+eng+","+math+","+getTotal()+","+getAverage();
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			Student tmp=(Student)obj;
			System.out.println("tmp:"+tmp);
			
			return name.compareTo(tmp.name);
		}else {
			return -1;
		}
	}
}


public class Exercise11_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(new Student("È«±æµ¿",1,1,100,100,100));
		list.add(new Student("³²±Ã¼º",1,2,90,70,80));
		list.add(new Student("±èÀÚ¹Ù",1,3,80,80,90));
		list.add(new Student("ÀÌÀÚ¹Ù",1,4,70,90,70));
		
		Collections.sort(list);
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
