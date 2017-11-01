//package day7;
import java.util.*; 

public class ExcCheck {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		//int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose a number");
		int x = scan.nextInt();
		
		try{
			//System.out.println(arr[7]);
			//String e = "Array Out of bound";
			if(x < 10)
				throw new Exception("Numbers less than 10 are not accepted");
			System.out.println("The number you have chosen is " + x);
		}
		
		catch(Exception e){
			System.out.println("Exception found:");
			System.out.println(e);
		}

	}

}

