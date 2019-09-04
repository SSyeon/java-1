package kr.hs.emirim.program;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		//equals()
		Integer in1 = new Integer(100);
		Integer in2 = new Integer(100);
		Integer in3 = new Integer(200);
		System.out.println("in1 == in2 --> "+(in1 == in2));
		System.out.println("in1.equals(in2) --> "+in1.equals(in2));
		System.out.println("in1.equals(in3) --> "+in1.equals(in3));
		System.out.println("------------------");
		//toString() : Wrapper 클래스 -> String
		System.out.println(new Integer(100).toString());
		System.out.println(new Double(55.7).toString());
		System.out.println("------------------");
		//valueOf() : String -> Wrapper 클래스
		System.out.println(Integer.valueOf("123"));
		System.out.println(Double.valueOf("123.456"));
		//parseInt() : String -> int
		System.out.println(Integer.parseInt("456"));
		//parseDouble() : String -> double
		System.out.println(Double.parseDouble("789.123"));
		//Wrapper클래스 -> 기본자료형
		System.out.println(new Integer(100).intValue());
		System.out.println(new Double(3.31).doubleValue());
		
		ArrayList arr = new ArrayList();
		arr.add(new Integer(200));
		arr.add(100);	//new Integer(100)
		for(Object o : arr) {
			System.out.println((int)o);
		}
		
		
	}

}













