package javaapp;
import java.util.Scanner;

public class addition {
		
		private static int addition1(int a, int b) {
			// TODO Auto-generated method stub
		int sum=a+b;
		return sum ;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		float sum = addition1(a,b);
		System.out.println(sum);

	}

}
