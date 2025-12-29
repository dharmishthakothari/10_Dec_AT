package pkgFirst;

import java.util.Scanner;

public class ArrayExample5 {

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
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+ " is even");
			}else
			{
				System.out.println(arr[i]+" is odd");
			}
		}
		
		
	}

}
