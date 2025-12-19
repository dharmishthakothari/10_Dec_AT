package pkgFirst;

import java.util.Scanner;

public class ConditionalStmt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// no is positive or nagative
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=scan.nextInt();
		
		if(num>0)
		{
			System.out.println("Number is positive ");
		}else if(num<0)
		{
			System.out.println("number is Nagative");
		}else
		{
			System.out.println("Number is zero");
		}
		
		
		
		
	}

}
