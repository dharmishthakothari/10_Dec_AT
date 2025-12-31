package pkgFirst;

import java.util.Scanner;

public class ArrayExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// array
		// element i have to ask from user
		//print an array elements 
		
		
		//integer ka array hain , name hain roll_no and this can store 10 values/elements
		int[] roll_no=new int[10];
		
//		//float ka array hain , name hain tempreture and it can store 5 values/element
//		float[] tempreture=new float[5];
//		
//		//long ka array hain,name c_numbers and it can store 7 values/element
//		long[] c_numbers=new long[7];

		//user input
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<roll_no.length;i++)
		{
			System.out.println("Enter element ");
			roll_no[i]=scan.nextInt();
		}
		
		//for display
		for(int i=0;i<roll_no.length;i++)
		{
			System.out.println(roll_no[i]);
		}
		
	}

	
}
