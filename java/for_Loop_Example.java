package pkgFirst;

import java.util.Scanner;

public class for_Loop_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number ");
		int num=scan.nextInt();
		
		for(int i=2;i<=num;i+=2)
		{
			System.out.println("Hello World "+i);
		}
		
	}

}
