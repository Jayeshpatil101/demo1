package javaapp;
class Student{
	private int rollno;
	private String name;
	

public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


public class Product{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud= new Student();
		stud.setRollno(12);
		stud.setName("ajay");
		System.out.println("student roll number"+stud.getRollno());
		System.out.println("student name"+stud.getName());
	}

	}

}
