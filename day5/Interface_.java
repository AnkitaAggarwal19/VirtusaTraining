//package day5;

interface interface_test{
	 default void test(){
		 System.out.println("Testing 1...");
	 }
}

public class Interface_ implements interface_test {
	
	public void test(){
		System.out.println("Testing...");
	}
	
	public static void main(String args[]){
		Interface_ obj = new Interface_();
		obj.test();
	}

}

