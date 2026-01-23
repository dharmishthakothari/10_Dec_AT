package pkgOOP;
class Person1
{
	int c_no;
	String name;
	Person1()
	{
		
	}
	public Person1(String n,int c)
	{
		name=n;
		c_no=c;
	}
	void display()
	{
		System.out.print(name+"\t"+c_no);
	}
}
class Employee1 extends Person1
{
	int salary,eid;
	String dept;
	public Employee1(int e,String n,int c,String d,int s) {
		super(n,c);
		eid=e;
		salary=s;
		dept=d;		
	}
	//@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println();
		super.display();
		System.out.println("\t"+eid+"\t"+salary+"\t"+dept);
		
	}
	
	
}



public class Example_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person1 obj=new Person1("Ritesh",98987);
		obj.display();
		
		
		Employee1 obj2=new Employee1(101, "Dharmishtha", 8787, "Software", 25000);
		obj2.display();
	}

}
