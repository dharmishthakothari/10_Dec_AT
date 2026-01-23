package pkgOOP;




public class Example_Overloading {

	float addition(int no1,int no2)
	{
		return no1+no2;
	}
	float addition(int no1,float no2,float no3)
	{
		return no1+no2+no3;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example_Overloading obj=new Example_Overloading();
		obj.addition(12, 23,34);
		obj.addition(324,324,453);
		
	}

}
