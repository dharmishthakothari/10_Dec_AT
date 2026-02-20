package pkgAdv;

import java.util.ArrayList;
import java.util.HashSet;

public class CollectionExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Float> lstPer=new ArrayList<Float>();
		lstPer.add(23.45f);
		lstPer.add(78.45f);
		lstPer.add(34.657f);
		System.out.println(lstPer);
		System.out.println(lstPer.get(2));
		
		HashSet<String> stu_names=new HashSet<String>();
		stu_names.add("Damini");
		stu_names.add("Dharmishtha");
		stu_names.add("Ritesh");
		
		ArrayList<String> str_names=new ArrayList<String>(stu_names);
		System.out.println(stu_names+"\t"+str_names);
		System.out.println(str_names.get(0));
		
		
		

	}

}
