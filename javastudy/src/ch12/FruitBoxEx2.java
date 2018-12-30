package ch12;

import java.util.ArrayList;

class Fruits implements Eatable{
	public String toString() {return "Fruit";}
}

class Apples extends Fruits {public String toString() {return "Apple";}}
class Grapes extends Fruits {public String toString() {return "Grape";}}
class Toys {public String toString() {return "Toy";}}

interface Eatable{}

public class FruitBoxEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitsBox<Fruits> fruitsBox = new FruitsBox<Fruits>();
		FruitsBox<Apples> applesBox = new FruitsBox<Apples>();
		FruitsBox<Grapes> grapesBox = new FruitsBox<Grapes>();
		
		fruitsBox.add(new Fruits());
		fruitsBox.add(new Apples());
		fruitsBox.add(new Grapes());
		applesBox.add(new Apples());
		grapesBox.add(new Grapes());
		
		System.out.println("fruitBox="+fruitsBox);
		System.out.println("appleBox="+applesBox);
		System.out.println("grapeBox="+grapesBox);
	}
}

class FruitsBox<T extends Fruits & Eatable> extends Boxs<T>{}

class Boxs<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
