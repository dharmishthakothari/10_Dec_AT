package pkgFirst;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// age>18 weight>55 --donate blood 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Age");
		int age=scan.nextInt();
		
		System.out.println("Enter weight ");
		int weight=scan.nextInt();
		
//		if(age>=18 && weight>=55)
//		{
//			System.out.println("You are eligible to donate blood");
//		}
//		else
//		{
//			System.out.println("You are not eligible to donate blood");
//		}
		
		if(!(age>=18 && weight>=55))
		{
			System.out.println("You are eligible to donate blood");
		}
		else
		{
			System.out.println("You are not eligible to donate blood");
		}

		
		
		
		
		
	}

}
