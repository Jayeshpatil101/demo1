package javaapp;
import java.util.Scanner;

public class division {
	public static int multiplication(int a , int b) {
		int Mull = a*b;
		return Mull;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner Sc = new Scanner(System.in);
	    int a = Sc.nextInt();
	    int b = Sc.nextInt(); 
	    System.out.println(a);
	    System.out.println(b);
	    int Mull = multiplication(a,b);
	    System.out.println(Mull);
		

	}

}

