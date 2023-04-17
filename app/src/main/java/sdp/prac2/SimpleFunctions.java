package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {

    }

    
    public Boolean Task5( List<Integer> items){
        if (items == null || items.size() < 2) {
            // True is returned if a list has zero or one item in it, as a list with one or zero items does not need to be sorted. It is already in a sorted state 
            return true;
        }
        
        for (int i = 1; i < items.size(); i++) {
            if (items.get(i) < items.get(i - 1)) {
                // / Traversing the list, checking if the current item is less than the preivous item , if true then it means that the list is not sorted
                return false;
            }
        }
        
        // If we get to this point, the list is sorted
        return true;
    }   

}
