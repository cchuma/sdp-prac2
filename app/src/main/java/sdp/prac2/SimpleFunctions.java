package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public int Task1 (int[] a , int[] b){
	
		int x = 0;
		
		for (int i1 = 0, i1 < b.length, i1++){
			bnum = b.get(i1);
			for(int i = 0, i < bnum,i++){
				if (bnum > a.length){
					break;
				}else{
					x = x + a.get(i);
				}
			}
			return x;
		}
    }

    public static List<Integer> Task4(int[] a, int[] b) {
        if (a.length != b.length) {                                 // Check if the lengths of the lists are the same
            return null;
        }
        

        List<Integer> results = new ArrayList<>();                  // Initialize an empty list to hold the result
        // Loop over the length of a
        for (int i = 0; i < a.length; i++) {
            int product = a[i] * b[b.length - i - 1];               // Calculate the product of the corresponding elements of a and b
            results.add(product);                                   // Add the product to the results ArrayList
        }
         return results;
    }


}

