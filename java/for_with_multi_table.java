package pkgFirst;

import java.util.Scanner;

public class for_with_multi_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number ");
		int num=scan.nextInt();
		
		
		if(num%2==0)
		{
			int mul;
			for(int i=1;i<=10;i++)
			{
				mul=num*i;
				System.out.println(num+" * "+i+" = "+mul);
			}
		}else
		{
			System.out.println("Please enter only even number ");
		}
		
		
		
	}

}
