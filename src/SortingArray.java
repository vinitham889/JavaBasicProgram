
public class SortingArray {
	public static void main(String[] args) {
		int array[] = {2,9,5,1,7,8,6};
		int index = -1;
	
	
	for (int i = 0; i <array.length; i++){
		index = i;
		for (int j = i ; j <= array.length-1; j++){
		if (array[j] < array[index]){
		index = j;
		}
		}
		int temp = array[i];
		array[i] = array[index];
		array[index] = temp;
		}
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]+",");
	}

	}
}
