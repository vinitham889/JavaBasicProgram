package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList
		ArrayList<String> al = new ArrayList<String>();
		al.add("w1");
		al.add("w2");
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("q1");
		ll.add("q2");
		ll.add("q3");
		ll.add("q4");
		ll.addAll(0,al);
		System.out.println(ll);
		ll.set(1, "q8");
		ll.remove("q2");
		
		System.out.println(ll);
		System.out.println(ll.get(0));
		//Handle synchronization explicitly
		Collections.synchronizedList(ll);
		

	}

}
