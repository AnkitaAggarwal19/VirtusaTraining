//package day5;

//abstract class can have 0-100% abstraction
abstract class Money{
	abstract void msg();
	void add(){
		System.out.println("In abstract class..");
	}
}

class RsFive extends Money{
	void msg(){
		System.out.println("This is the abstract method in abstract class");
	}
	
	void add(){
		System.out.println("Add five Rs coin here.");
	}
}

class RsTen extends Money{
	void add(){
		System.out.println("Add Ten Rs coin here.");
	}
	
	void msg(){
		//System.out.println("This is the abstract method in abstract class");
	}
}

public class AbsPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RsFive obj1 = new RsFive();
		obj1.add();
		
		Money obj2 = new RsTen();
		obj2.add();
		
		obj1.msg();

	}

}

