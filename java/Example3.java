package pkgOOP;

import java.util.Scanner;

class Person
{
	int c_no;
	String name,address;
	public void getDetails()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name");
		name=scan.next();
		
		System.out.println("Enter address");
		address=scan.next();
		
		System.out.println("Enter c_no");
		c_no=scan.nextInt();
	}
	public void display()
	{
		System.out.println(name+"\t"+address+"\t"+c_no);
	}
}

class Employee extends Person
{
	
}

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		
	}

}
