//package day4;
import java.util.*;

public class DecimalFormat {
	
	//calculates the average of numbers in the array
	public static double average(int[] arr, int i)
	{
		int sum = 0;
		
		for(int j = 0; j < i; j++)
		{
			sum = sum + arr[j];
		}
		
		double avg = sum/i;
		
		return avg;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[20];
		int i;
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		//Max 20 numbers are to be stored in array.
		for(i = 0; i < 20; i++)
		{
			int num = scan.nextInt();
			
			//numbers are stored in array till -1 is found
			if(num == -1)
				break;
			else
				arr[i] = num;
		}
		
		double avg = average(arr, i);
		System.out.printf("Average = %.2f", avg);
	}

}

