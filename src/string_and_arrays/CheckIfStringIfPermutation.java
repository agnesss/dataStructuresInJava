package string_and_arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by UserPC on 1/5/2018.
 */
public class CheckIfStringIfPermutation {

    //Given 2 strings, check is one string is a permutation of the other

    //Method 1.
    //Sort both strings and test the equality
    //O(n log n) runtime and O(1) space

    //Method 2. Put the first string inside a hashmap
    //Check if the characters of the second string are in the map
    // O(n) runtime and O(n) space

    //Lets get started!

    public static boolean checkIfPermBySorting(String initial1, String initial2) {
        char  []  elements =  initial1.toCharArray();
        Arrays.sort(elements);
        initial1 = new String(elements);

        elements = initial2.toCharArray();
        Arrays.sort(elements);
        initial2 = new String(elements);

        return initial1.equals(initial2);
    }


    public static boolean checkIfPerUsingDS(String initial1, String initial2) {
        HashMap<String, Integer> map  = new HashMap<>();
        for(String c : initial1.split("")) {
            map.put(c, 1);
        }

        for(String key :  initial2.split(""))
            if(!map.containsKey(key)) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPermBySorting("agnes", "anegs"));

        System.out.println(checkIfPerUsingDS("agnes", "aegsn"));

        String test = "Agnes are mere   ";
        int givenLength = 14;

        test = test.substring(0, givenLength);
        System.out.println(test);
        test = test.replace(" ", "%20");

        System.out.println(test);





    }
}
