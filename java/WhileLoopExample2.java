package pkgFirst;

public class WhileLoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1;
		int sum=0;
		while(i<=10)
		{
			sum+=i;
			System.out.println("Sum == "+sum+" i = "+i);
			i++;
		}
		System.out.println("Total "+sum);
		
	}

}
