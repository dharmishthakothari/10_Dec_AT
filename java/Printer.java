package pkgOOP;



class LaserPrinter extends Printer {
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print with Laser Printer ");
	}
}

public class Printer {
	public void testPrint(Printer p) {
		p.print();
	}
	public void print() {
		System.out.println("In Printer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer obj=new Printer();
		obj.testPrint(new Printer());
		obj.testPrint(new LaserPrinter());
		

	}

}
