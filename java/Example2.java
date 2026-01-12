package pkgOOP;

import java.util.Scanner;

class Book
{
	String title;
	int no_of_pages,price;
	public void getDetails()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter title ");
		title=scan.next();
		
		System.out.println("Enter price ");
		price=scan.nextInt();
		
		System.out.println("Enter no of pages");
		no_of_pages=scan.nextInt();
	}
	public void display()
	{
		System.out.println(title+"\t"+price+"\t"+no_of_pages);
	}
}


public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Book obj1=new Book();
//		Book obj2=new Book();
//		
//		obj1.getDetails();
//		obj2.getDetails();
//		
//		obj1.display();
//		obj2.display();
//		
//		Book obj3=new Book();
//		obj3.getDetails();
//		obj3.display();
		
		Book[] obj=new Book[10];
		
		for(int i=0;i<obj.length;i++)
		{
			//object creation
			obj[i]=new Book();
			//method calling
			obj[i].getDetails();
		}
		for(int i=0;i<obj.length;i++)
		{
			obj[i].display();
		}
		
		
		
		
		
		
	}

}
