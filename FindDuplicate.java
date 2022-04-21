/*
 * FindDuplicate that reads n integer arguments from the command line 
 * into an integer array of length n, where each value is between is 1 and n, 
 * and displays true if there are any duplicate values, false otherwise.

 */

public class FindDuplicate {

    public static void main(String[] args) {

		if (args.length > 0) {
			int sum = 0, n = args.length;

			for (int i = 0; i<n; i++) {
				sum += Integer.parseInt(args[i]);

			}

			int actualSum = (n*(n+1))/2;

			if (actualSum == sum) {
				System.out.println("false");

			}
			else {
				System.out.println("true");
			}


		}

		
	}
}
