package javaapp;
import java.util.Scanner;

public class avrage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		
		
		int a=0,b=0,c=0;
		int sum=0,avg=0;
		System.out.println("\n\n");
		System.out.println("enter the first value");
		a=input.nextInt();
		System.out.println("enter the second value");
		b=input.nextInt();
		System.out.println("enter the third value");
		c=input.nextInt();
		
		sum = (a+b+c);
		avg = sum/3;
		System.out.println("the totalavrage is "+avg);
		
		
		

	}

}
