//package day3;
import java.util.*;

public class Account {
	int accountNumber;
	double balance = 0.0;
	
	Account(int accountNumber, double balance)
	{
		this(accountNumber);
		this.balance = balance;
	}
	
	Account(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void credit(double amount)
	{
		balance = balance + amount;
	}
	
	public void debit(double amount)
	{
		if(balance > amount)
			balance = balance - amount;
		else
			System.out.println("amount withdrawn exceeds the current balance");
	}
	
	public String toString()
	{
		return "A/C no: " + accountNumber + ", Balance: " + balance;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner class
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your account no.");
		int acNo = scan.nextInt();
		
		System.out.println("Enter the balance");
		double bal = scan.nextDouble();
		
		Account obj = new Account(acNo, bal);
		obj.setBalance(bal);
		
		System.out.println("Enter the amount you want to credit or debit");
		double amnt = scan.nextDouble();
		
		obj.credit(amnt);
		System.out.println("Balance after credit = " + obj.getBalance());
		
		obj.debit(amnt);
		System.out.println("Balance after debit = " + obj.getBalance());
		System.out.println();
		System.out.println("Account details: " + obj.toString());
	}
}

