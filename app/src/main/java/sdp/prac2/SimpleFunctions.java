package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
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

