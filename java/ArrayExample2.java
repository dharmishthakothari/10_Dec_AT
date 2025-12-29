package pkgFirst;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create array of having 100 elements
		int[] arr=new int[45];
		
		//initlize it with 101 to 200 values 
//		arr[0]=11;
//		arr[1]=12;
//		arr[2]=13;
//		arr[3]=14;
//		arr[4]=15;
//		arr[5]=16;
//		arr[6]=17;
//		arr[7]=18;
//		arr[8]=19;
//		arr[9]=20;
		for(int i=0,j=101;i<arr.length;i++,j++)
		{
			arr[i]=j;
			System.out.println(arr[i]);
		}
		
				
		
		
	}

}
