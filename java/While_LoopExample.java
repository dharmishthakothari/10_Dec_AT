package pkgFirst;

import java.util.Scanner;

public class While_LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=scan.nextInt();
		int i=1;
		while(i<=num)
		{
			System.out.println(i);
			i++;
		}
		
		//Multiplication table 
		i=1;
		System.out.println("Multilication table ");
		while(i<=10)
		{
			
			System.out.println(num+" * "+i+" = "+num*i);
			i++;
		}
		

	}

}
