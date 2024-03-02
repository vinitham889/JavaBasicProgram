package collectionframework;

import java.util.HashMap;
import java.util.HashSet;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet -->HashMap-->Arrays of nodes (key,value)
		//dummy object
		//new Object();
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(2);
		hs.add(85);
		hs.add(65);
		hs.add(5);
		hs.add(5);//Duplicates value
		hs.add(85);
		System.out.println(hs);//output : [65, 2, 85, 5, 10]
		System.out.println(hs.remove(85));
		System.out.println(hs.contains(5));
		
		//retrieve
		for (Integer element : hs) {
			System.out.println(element);
			
		}
		

	}

}
