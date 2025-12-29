package pkgFirst;

import java.util.Scanner;

public class ArrayExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[10];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element ");
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}
		
		
	}

}
