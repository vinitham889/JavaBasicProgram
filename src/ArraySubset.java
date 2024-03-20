
public class ArraySubset {
	public static boolean isSubsetSorted(int[] a1, int[] a2) {
	        int i = 0, j = 0;

	        while (i < a1.length && j < a2.length) {
	            if (a1[i] == a2[j]) {
	                j++;
	            }
	            i++;
	        }

	        return j == a2.length;
	    }

	    public static void main(String[] args) {
	        int[] a1_1 = {11, 7, 1, 13, 21, 3, 7, 3};
	        int[] a2_1 = {11, 3, 7, 1, 7};
	        System.out.println("Example 1: " + (isSubsetSorted(a1_1, a2_1) ? "Yes" : "No"));

	        int[] a1_2 = {1, 2, 3, 4, 4, 5, 6};
	        int[] a2_2 = {1, 2, 4};
	        System.out.println("Example 2: " + (isSubsetSorted(a1_2, a2_2) ? "Yes" : "No"));

	        int[] a1_3 = {10, 5, 2, 23, 19};
	        int[] a2_3 = {19, 5, 3};
	        System.out.println("Example 3: " + (isSubsetSorted(a1_3, a2_3) ? "Yes" : "No"));
	    }
	}

	


