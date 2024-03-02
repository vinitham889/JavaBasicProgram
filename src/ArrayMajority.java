import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayMajority {
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 2, 5,5,5,7,3,5,5,5};
		int N = arr.length;
		HashMap<Integer, Integer> hm=new HashMap<>();
		for(int i=0;i<N;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm);
		for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
			if(e.getValue()>N/2) {
				System.out.println(e.getKey());
			}
		}
	}
}
	


