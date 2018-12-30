package ch12;

import java.util.Arrays;

class MyArrayList4<T>{
	T[] arr;
	
	@SafeVarargs
	@SuppressWarnings("varargs")
	MyArrayList4(T... arr){
		this.arr=arr;
	}
	
	@SafeVarargs
	public static <T> MyArrayList4<T> asList(T... a){
		return new MyArrayList4<>(a);
	}
	
	public String toString() {
		return Arrays.toString(arr);
	}
}

public class AnnotationEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList4<String> list = MyArrayList4.asList("1","2","3");
		
		System.out.println(list);

	}

}
