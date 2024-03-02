package collectionframework;
import java.util.*;
import java.util.Vector;
public class VList{
	public static void main(String args[])
	{
		Vector v1 = new Vector();
	    v1.add("vini");
	    v1.add("sap");
	    v1.add(0,"kavin");
	    
	    Vector v2 = new Vector();
	    v2.add("Navya");
	    v2.add("vaishu");
	    
	    v1.addAll(0,v2);
		System.out.println(v1);
		System.out.println(v2);
		//size no of elements in array
		//capacity gives array capacity
//		System.out.println(v1.size());
//		System.out.println(v1.capacity());
		
		//Retrieval of data from list get()
		
		System.out.println(v1.get(3));
		
		//remove
		v1.removeFirst();
		
		System.out.println(v1);
		
		//To remove all element from list
		v2.clear();
		System.out.println(v2);
		
		//to verify  we use contains method and containsAll
		System.out.println(v1.contains("vini"));
		
		//to update the element in list we use set method
		v1.set(1, "vinitha");
		System.out.println(v1.get(1));
		
		//To get index of elemnet 
		System.out.println(v1.indexOf("vinitha"));
		//convert to array
		Object[] arr = v1.toArray();
		//to print direct array we use toString
		System.out.println(Arrays.toString(arr));
		//to convert array to list
		Object[] arr1 = new Object[] {1,2,3,4,5};
		Vector v3 =new Vector(Arrays.asList(arr1));
		
		
	}
	
}