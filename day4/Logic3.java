//package day4;
import java.util.*;

public class Logic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//assign memory to array
		int[] arr = new int[10];
		int largest = 0;
		
		System.out.println("Enter the numbers to be stored in the array");
		for(int counter = 0; counter < 10; counter++)
		{
			int number = scan.nextInt();
			arr[counter] = number;
			
			//if recently entered number is larger than the largest number
			if(largest < number)
				largest = number;
		}
		System.out.println();
		System.out.println("Largest number is " + largest);

	}

}

