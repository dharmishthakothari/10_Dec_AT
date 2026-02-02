package pkgOOP;

public class ImplementationClass implements MathImple {
	@Override
	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		if(num%2==0)
			return true;
		return false;
	}

	@Override
	public boolean isPositive(int num) {
		// TODO Auto-generated method stub
		if(num>0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationClass obj=new ImplementationClass();
		System.out.println(obj.isEven(23));
		System.out.println(obj.isPositive(-34));
	}

}
