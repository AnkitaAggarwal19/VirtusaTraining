//package day8;
import java.util.*;

public class Time {

	private int second;
	private int minute;
	private int hour;
	
	//default constructor
	Time() { 
		second = 0;
		minute = 0;
		hour = 0;
	}
	
	//parameterized constructor
	Time(int second, int minute, int hour) {
		this.second = second;
		this.minute  = minute;
		this.hour = hour;
	}
	
	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	//returns time in the required format
	public String toString() {
		
		return String.format("%02d" + ":" + "%02d" + ":" + "%02d",hour, minute, second);

	}
	
	public void setTime(int second, int minute, int hour) {
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	//increase the time by ine second
	Time nextSecond() {
		if(second == 59) {
			
			second = 0;
			
			if(minute == 59) {
				
				minute = 0;
				
				if(hour == 23) {
					
					hour = 0;
				}
				else {
					hour += 1;
				}
			}
			else {
				minute += 1;
			}
		}
		else {
			second += 1; 
		}
		
		return this;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the time in hour, minute and seconds format");
		int hour = scan.nextInt();     //input hour
		int minute = scan.nextInt();   //input minute
		int second = scan.nextInt();   //input second
		
		try {
			
			if(hour < 0 || hour > 23)
				throw new IllegalException("Invalid hour");
			if(minute < 0 || minute > 59)
				throw new IllegalException("Invalid minute");
			if(second < 0 || second > 59)
				throw new IllegalException("Invalid seconds");
		}
		
		catch(IllegalException e) {
			
			System.out.println(e);
			return;
		}
		
		//object of the class time
		Time obj = new Time();
		
		obj.setHour(hour);
		System.out.println("Hours is " + obj.getHour());      //output hour
		
		obj.setMinute(minute);
		System.out.println("Minutes is " + obj.getMinute());  //output minute
		
		obj.setSecond(second);
		System.out.println("Seconds is " + obj.getSecond());  //output seconds
		
		obj.setTime(second, minute, hour);
		
		obj.nextSecond();
		
		//time with 1 second increment
		System.out.println("Required time is " + obj.toString());
		
	}

}

class IllegalException extends Exception {
	String str;
	
	IllegalException(String str2){
		str = str2;
	}
		
	public String toString(){
		return ("Exception found: " + str ) ;
	}
}
