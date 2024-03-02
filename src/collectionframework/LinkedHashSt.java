package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHashSet -> LinkedHashMap ->link of nodes (key,value)
		// order of insertion will be stored
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(2);
		lhs.add(85);
		lhs.add(65);
		lhs.add(5);
		lhs.add(5);//Duplicates value
		lhs.add(85);
		System.out.println(lhs);
		//retrieve
				for (Integer element : lhs) {
					System.out.println(element);
					
				}
				//Auto sort
				//TreeSet -> TreeMap->binary tree
				TreeSet<Integer> ts = new TreeSet<>();
				ts.add(101);
				ts.add(102);
				ts.add(104);
				ts.add(103);
				ts.add(105);
				ts.add(107);//Duplicates value
				ts.add(106);
				System.out.println(ts);
				//To get min and max value in tree
//				System.out.println(ts.first());//mini value
//				System.out.println(ts.last());// max value
				//subset used to get range of values
				System.out.println(ts.subSet(4, 102));
				
				//descending order
				System.out.println(ts.descendingSet());
				
				//remove elemnet in treeset : poll ,remove
				System.out.println(ts.pollFirst());
				System.out.println(ts.pollLast());
				
				

	}

}
