package pkgFirst;

import java.util.Scanner;

public class Swtichcase_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter day number(1-7) ");
		int day=scan.nextInt();

		switch(day)
		{
		case 1:System.out.println("Monday");
				break;
		case 2:System.out.println("Tuesday");
				break;
		case 3:System.out.println("Wednsday");
				break;
		default : System.out.println("Invalid day");
		}
	}

}
