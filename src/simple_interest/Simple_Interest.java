package simple_interest;

import java.util.Scanner;

public class Simple_Interest {
	//class attributes
	private double principle_amount;
	private double RATE;
	private double time;
	
	//Constructor
	Simple_Interest(double principle_amount, double RATE, double time) {
		this.principle_amount = principle_amount;
		this.RATE = RATE;
		this.time = time;
	}
	
	//Method declaration
	public void calculateSimpleInterest() {
		double si;
		si = (principle_amount * RATE * time) / 100;
		
		if(principle_amount < 0 || RATE < 0 || time < 0) {
			System.out.println("INVALID INPUT!"+"\n"+
		"The program does not support negative input..");
		}
		else {
			System.out.println("Simple Interest is: " + si);
		}
	}
	
	//Main  method
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		//variable declaration
		double principle;
		double time;
		double rate;
		
		System.out.println("\t\n--------SIMPLE INTEREST CALCULATOR--------");
		System.out.println("\t\t--WELCOME--\n");
		System.out.print("Enter principle amount: ");//prompt
		principle = input.nextDouble();//input
		
		System.out.print("Enter duration period(time): ");//prompt
		time = input.nextDouble();//input
		
		System.out.print("Enter interest rate(%ge): ");//prompt
		rate = input.nextDouble();//input
		
		//object of a class
		Simple_Interest interest = new Simple_Interest(principle, rate, time);
		
		System.out.println();
		
		interest.calculateSimpleInterest();//function call
	}
}
