//package day6;

public class WrapperIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		//converting the primitive data type to object
		Integer obj1 = new Integer(a);
		
		//unboxing -- wrapper class to primitive data type
		int b = obj1.intValue();
		
		System.out.println(a + " " + obj1 + " " + b);

	}

}

