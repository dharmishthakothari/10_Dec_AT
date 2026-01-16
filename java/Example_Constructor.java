package pkgOOP;

class Student
{
	int roll_no,c_no;
	String name;
	public Student()
	{
		System.out.println("In no parameterized constructor");
	}
	public Student(int r,String n,int c)
	{
		roll_no=r;
		name=n;
		c_no=c;
	}
	
	public Student(int r,String n)
	{
		roll_no=r;
		name=n;
	}
	
	public void display()
	{
		System.out.println(roll_no+"\t"+name+"\t"+c_no);
	}
}


public class Example_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.display();
		
		Student s1=new Student(101, "Ritesh", 34567);
		s1.display();
		
		Student s2=new Student(2,"test",45454);
		s2.display();
		
		Student s3=new Student(2,"dsfsdf");
		s3.display();
		
		
		
	}
	
	

}
