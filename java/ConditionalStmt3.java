package pkgFirst;

import java.util.Scanner;

public class ConditionalStmt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter day number(1-7) ");
		int day=scan.nextInt();
		
		if(day==1)
		{
			System.out.println("Monday");
		}else if(day==2)
		{
			System.out.println("Tuesday");
		}else if(day==3)
		{
			System.out.println("Wednsday");
		}else if(day==4)
		{
			System.out.println("Thrusday");
		}else if(day==5)
		{
			System.out.println("Firday");
			
		}
		else if(day==6)
			System.out.println("Satruday");
		else if(day==7)
			System.out.println("Sunday");
		else
			System.out.println("Invalid day");

	}

}
