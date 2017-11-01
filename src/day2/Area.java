package day2;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int l = scan.nextInt();
		int b = scan.nextInt();
		if(l % 8 == 0 && b % 8 == 0)
			System.out.println("0");
		else if(l % 8 == 0)
			System.out.println(l/8);
		else if(b % 8 == 0)
			System.out.println(b/8);
		else
			System.out.println(l/8 + b/8 + 1);
	}

}
