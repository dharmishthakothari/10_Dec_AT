package pkgAdv;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List lst=new ArrayList();
		ArrayList lst=new ArrayList();
		
		lst.add(12);
		lst.add(23);
		lst.add(90);
		System.out.println(lst);
		
		ArrayList city=new ArrayList();
		city.add("Ahemedabad");
		city.add("Gandhinagar");
		city.add("Mumbai");
		city.add("Ahemedabad");
		city.add("Gandhinagar");
		city.add("Mumbai");
		city.add(23.34);
		city.add(new Date());
		System.out.println(city);
		
		Set set=new HashSet();
		set.add(1234);
		set.add(22);
		set.add(895);
		set.add(1234);
		set.add(22);
		System.out.println(set);
		
	}

}
