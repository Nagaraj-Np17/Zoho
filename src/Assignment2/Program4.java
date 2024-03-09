package Assignment2;

import java.util.Scanner;

//Write a program to calculate a person's Body Mass Index on user input for weight and height. 
//Get BMI formula from the internet.
public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Person Name:");
		String name=sc.next();
		System.out.println("Enter the Person weight:");
		float wt=sc.nextFloat();
		System.out.println("Enter the Person Height:");
		float ht=sc.nextFloat();		
		System.out.print("BMI Value of  The Person ="+calcBMI(name,wt,ht));	
		

	}

	private static float calcBMI(String name, float wt, float ht) {
		float metre=(float)(ht/100.0);
		float bmi=(float) (wt/(Math.pow(metre,2)));;
		return bmi;
		
	}

}
