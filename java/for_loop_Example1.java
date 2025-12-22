package pkgFirst;

import java.util.Scanner;

public class for_loop_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number ");
		int num=scan.nextInt();
	
		for(int i=num;i>=1;i--)
		{
			System.out.println(i);
		}
		

	}

}
