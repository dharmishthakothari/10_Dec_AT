package pkgFirst;

import java.util.Scanner;

public class Arr_exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float[] temp=new float [5];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<temp.length;i++) {
			System.out.println("enter element");
			temp[i]= scan.nextFloat();
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp [i]);
		}
	}
	

}
