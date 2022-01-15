
package javaapp;
import java.util.Scanner;

public class troops {
	public static void Myname(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println(name);
		
		

	}

}
