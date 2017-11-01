//package day6;
import java.util.*;

public class Reduce {
	
	//returns the minimum of 3 numbers
	int min(int x, int y, int z){
		return (x < y) ? (x < z) ? x : z : (y < z) ? y : z;
	}
	
	//Recursive function
	int min_steps(int num){
		int x = num, y = num, z = num;
		
		if(num <= 1)
			return 0;
		
		if(num % 3 == 0)
			x = min_steps(num / 3);
		
		if(num % 2 == 0)
			y = min_steps(num / 2);
		
		z = min_steps(num - 1);
		
		return 1 + min(x, y, z);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//class object
		Reduce obj = new Reduce();
		//Scanner class
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		System.out.println("Minimum no. of steps are " + obj.min_steps(num));

	}

}

