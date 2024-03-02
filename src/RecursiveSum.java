
public class RecursiveSum {
	

	    static double calculateSeriesSum(double a, int n) {
	        double sum = 0;

	        for (int i = 0; i <= n; i++) {
	            sum += Math.pow(a, i);
	        }

	        return sum;
	    }

	    public static void main(String[] args) {
	    	double a = 2;
	    	int n =10;
	    	System.out.println(calculateSeriesSum(a,n));
	    	
	       



	    }
	}


	

