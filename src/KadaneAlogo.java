
public class KadaneAlogo {
	

	    public static int maxSubarraySum(int[] arr) {
	        int n = arr.length;
	        int maxSum = arr[0];
	        int currentSum = arr[0];

	        for (int i = 1; i < n; i++) {
	        	currentSum = currentSum+arr[i];
	        	if(currentSum>maxSum) {
	        		maxSum = currentSum;
	        	}
	        	if(currentSum<0) {
	        		currentSum =0;
	        	}

	        }

	        return maxSum;
	    }

	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, -2, 5};
	        int[] arr2 = {-1, -2, -3, -4};
	        System.out.println("Arr 1 Output: " + maxSubarraySum(arr1));
	        System.out.println("Arr 2 Output: " + maxSubarraySum(arr2));
	    }
	}



