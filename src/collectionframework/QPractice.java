package collectionframework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class QPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue
		//comparator is used to get element which is higher integer
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		//Addition : add , offer
		pq.add(8);
		pq.add(2);
		pq.offer(5);
		pq.offer(1);
		pq.add(7);
		System.out.println(pq);
		
		//Retrieval : peek (retrieves only head element)
		System.out.println(pq.peek());
		
		//verify element is present or not 
		System.out.println(pq.contains(5));
		
		//Remove: poll() and remove()
		while(!pq.isEmpty())
		{
			System.out.println(pq.poll());
		}
		//To delete all element 
		//pq.clear();
		
		

	}

}
