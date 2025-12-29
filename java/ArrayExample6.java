package pkgFirst;

import java.util.Scanner;

public class ArrayExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no of elements you want...");
		int num=scan.nextInt();
		
		int[] arr=new int[num];
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
