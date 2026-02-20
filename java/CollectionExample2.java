package pkgAdv;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList lst=new ArrayList();
		lst.add("123");
		lst.add(345);
		lst.add("gggg");
		lst.add(333);
		lst.add(34.56);
		
		//check item/ement is integer or not
		Iterator i=lst.iterator();
		while(i.hasNext())
		{
			//System.out.println(i.next());
			Object o=i.next();
			if(o instanceof Double)
			{
				System.out.println(o);
			}
		}
	}

}
