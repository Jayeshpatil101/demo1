package javaapp;
import java.util.Scanner;

class Bank{
	public String Name;
	public int Rollnum;
	
	
	

public String getName() {
		return Name;
	}




	public void setName(String name) {
		this.Name = name;
	}




	public int getRollnum() {
		return Rollnum;
	}




	public void setRollnum(int rollnum) {
		this.Rollnum = rollnum;
	}




public class bank {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sc =new Bank();
		sc.setName("ajay");
		sc.setRollnum(0);
		System.out.println(sc.getRollnum());
		System.out.println(sc.getName());
	}
		
		
		
		

	}

}
