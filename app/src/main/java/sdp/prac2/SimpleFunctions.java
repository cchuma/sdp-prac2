package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {
    }

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

    public static boolean Task3(String sen) { // this tasks that takes in a string and checks to see if the are curved
                                              // brackets() that the number of open
                                              // and closed brackects are the same and that they are nested properly and
                                              // returns if this is true or false
        int c = 0; // the counter for the open brackets
        int s = 0; // the counter for the closed brackect
        for (int i = 0; i < sen.length(); i++) {
            char ch = sen.charAt(i); // extracts character from string for analysis
            if (ch == '(' && s <= c) { // only counts when the character is an open brackect and the counter of closed
                // brackect is less or equal to that of the counter of open bracket
                c++;
            }
            if (ch == ')' && c > 0) { // only counts when the character is a closed brackect and the counter of open
                // brackect is greator than zero
                s++;
            }
        }
        if (c > 0 && c == s) { // if the open bracket is greater than zero and that the two counters are equal
            // it is true
            return true;
        } else {
            return false; // else
        }
    }

    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
        if (a.length != b.length) { // Check if the lengths of the lists are the same
            return null;
        }

        List<Integer> results = new ArrayList<>(); // Initialize an empty list to hold the result
        // Loop over the length of a
        for (int i = 0; i < a.length; i++) {
            int product = a[i] * b[b.length - i - 1]; // Calculate the product of the corresponding elements of a and b
            results.add(product); // Add the product to the results ArrayList
        }
        return results;
    }

}
