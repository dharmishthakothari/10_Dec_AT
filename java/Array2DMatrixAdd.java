package pkgFirst;

import java.util.Scanner;

public class Array2DMatrixAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr1=new int[2][2];
		int[][] arr2=new int[2][2];
		int[][] ans=new int[2][2];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter element for First Array");
		//accepting value for 1st array
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println("Enter element ");
				arr1[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter element for Second Array");

		//accepting value for 2nd array
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.println("Enter element ");
				arr2[i][j] = scan.nextInt();
			}
		}
		//Display array1
		System.out.println("First Array");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print("\t"+arr1[i][j]);					
			}
			System.out.println();
		}
		
		//Display array2
		System.out.println("Second Array");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print("\t"+arr2[i][j]);					
			}
			System.out.println();
		}

		//additing matrix
		System.out.println("Answer array ");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				
				ans[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print("\t"+ans[i][j]);					
			}
			System.out.println();
		}
		
	}

}
