package pkgFirst;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {12,45,6767,234234,87,5,3,21};
		int[] arr1=new int[20];
		
		System.out.println("LEN  "+arr.length);
		System.out.println("LEN arr1 "+arr1.length);
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("Sum of all elements "+sum);
	}

}
