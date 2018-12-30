package ch12;

abstract class MyEnum4<T extends MyEnum4<T>> implements Comparable<T>{
	static int id=0;
	int ordinal;
	String name="";
	
	public int ordinal() {return ordinal;}
	
	MyEnum4(String name){
		this.name=name;
		ordinal = id++;
	}
	
	public int compareTo(T t) {
		return ordinal-t.ordinal();
	}
}

abstract class MyTransportation4 extends MyEnum4{
	static final MyTransportation4 BUS = new MyTransportation4("BUS",100) {
		int fare(int distance) {return distance*BASIC_FARE;}
	};
	static final MyTransportation4 TRAIN = new MyTransportation4("TRAIN",150) {
		int fare(int distance) {return distance*BASIC_FARE;}
	};
	static final MyTransportation4 SHIP = new MyTransportation4("SHIP",100) {
		int fare(int distance) {return distance*BASIC_FARE;}
	};
	static final MyTransportation4 AIRPLANE = new MyTransportation4("AIRPLANE",300) {
		int fare(int distance) {return distance*BASIC_FARE;}
	};
	
	abstract int fare(int distance);
	
	protected final int BASIC_FARE;
	
	private MyTransportation4(String name, int basicFare) {
		super(name);
		BASIC_FARE=basicFare;
	}
	
	public String name() {return name;}
	public String toString() {return name;}
}

public class EnumEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTransportation4 t1=MyTransportation4.BUS;
		MyTransportation4 t2=MyTransportation4.BUS;
		MyTransportation4 t3=MyTransportation4.TRAIN;
		MyTransportation4 t4=MyTransportation4.SHIP;
		MyTransportation4 t5=MyTransportation4.AIRPLANE;
		
		System.out.printf("t1=%s, %d%n",t1.name(), t1.ordinal());
		System.out.printf("t2=%s, %d%n",t2.name(), t2.ordinal());
		System.out.printf("t3=%s, %d%n",t3.name(), t3.ordinal());
		System.out.printf("t4=%s, %d%n",t4.name(), t4.ordinal());
		System.out.printf("t5=%s, %d%n",t5.name(), t5.ordinal());
		System.out.println("t1==t2?"+(t1==t2));
		System.out.println("t1.compareTo(t3)="+t1.compareTo(t3));
	}

}
