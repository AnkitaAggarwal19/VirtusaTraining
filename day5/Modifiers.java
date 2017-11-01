//package day5;

class test{
	protected void test_func(){
		System.out.println("Parent class method");
	}
}

public class Modifiers extends test {

	//access modiefier of the ovverridden method must not be more restrictive
	protected void test_func(){
		System.out.println("Overridden method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers obj = new Modifiers();
		obj.test_func();
	}

}

