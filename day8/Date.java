//package day8;
import java.util.*;

public class Date {

	private int year;
	private int month;
	private int day;
	
	Date(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public String toString() {
		
		return String.format("%02d" + "/" + "%02d" + "/" + "%04d",month, day,year);

	}
	
	public void setDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year, month and day respectively");
		
		int year = scan.nextInt();   //input year
		int month = scan.nextInt();  //input month
		int day = scan.nextInt();    //input day
		
		try {
			
			if(year < 1000 || year > 9999)
				throw new myException("year should be between 1000 and 9999");
			
			if(month < 1 || month > 12)
				throw new myException("Month should be between 1 and 12");
			
			if(day < 1 || day > 31)
				throw new myException("Day should be between 1 and 31");
		}
		
		catch(myException e) {
			System.out.println(e);
			return;
		}
		
		//class object
		Date obj = new Date(year, month, day);
		
		obj.setYear(year);   //sets year
		System.out.println("Year is " + obj.getYear());      //outputs year
		
		obj.setMonth(month); //sets Month
		System.out.println("Month is " + obj.getMonth());    //outputs month
 		
		obj.setDay(day);    //sets day
		System.out.println("Month is " + obj.getDay());      //outputs day
		
		obj.setDate(year, month, day);
		System.out.println("The date is " + obj.toString()); //outputs date
		
	}

}

class myException extends Exception {
	String str;
	
	myException(String str2){
		str = str2;
	}
		
	public String toString(){
		return ("Exception found: " + str ) ;
	}
}
