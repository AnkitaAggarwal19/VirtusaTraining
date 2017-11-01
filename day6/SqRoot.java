//package day6;
import java.util.*;

public class SqRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		double num = scan.nextDouble();
		double m = 0.001;
		double i;
		
		for(i = 0; i < num/2; i++)
		{
			if(i * i > num){
				i -= m;
				while(i * i > num)
				{
					i -= m;
				}
				break;
			}
		}
		//gives the square root upto 2 decimal places
		System.out.printf("Square root = %.2f", i);

	}

}

