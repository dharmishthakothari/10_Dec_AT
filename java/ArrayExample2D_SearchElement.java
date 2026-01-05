package pkgFirst;

import java.util.Scanner;

public class ArrayExample2D_SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numbers = new int[2][2];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println("Enter element ");
				numbers[i][j] = scan.nextInt();
			}
		}
		// For display
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print("\t" + numbers[i][j]);
			}
			System.out.println();
		}
		System.out.println("Please enter element that you want to search ");
		int search = scan.nextInt();
		int temp = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (search == numbers[i][j]) {
					temp = 1;
					// System.out.println("Element Found ");
					break;
				} else {
					temp = 0;
					// System.out.println("Element not found");
				}
			}

		}

		if (temp == 1) {
			System.out.println("Element Found ");
		} else
			System.out.println("Element not found");

	}
}