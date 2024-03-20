package training;

import java.util.ArrayList;
import java.util.List;

public class MissingElementInArray {
	public static List<Integer> findMissingElement(int[]arr,int start,int end)
	{
		List<Integer> missingElements = new ArrayList<>();
		for(int i=start;i<=end;i++) {
			boolean found = false;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i)
				{
					found = true;
					break;
				}
			}
			if(!found) {
				missingElements.add(i);
				
			}
		}
		return missingElements;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,6,7,10};
		int start =1,end=10;
		List<Integer> missingElements = findMissingElement(arr,start,end);
		System.out.println("Missing Elements:");
		for(int element:missingElements)
		{
			System.out.print(element+" ");
		}
		
		//output Missing Elements: 3 5 8 9 

	}

}
