import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency {
	public static void countFreq(int arr[],int n) {
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else {
				hm.put(arr[i],1);
			}
		}
		for(Map.Entry<Integer, Integer>entry:hm.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arr");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements of arr");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		countFreq(arr,n);

	}

}
