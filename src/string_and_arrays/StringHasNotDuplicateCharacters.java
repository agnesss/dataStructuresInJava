package string_and_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by UserPC on 1/5/2018.
 */
public class StringHasNotDuplicateCharacters {

    //Verify if a String has all unique characters. What if you cannot use an additional data structure?

    //1.  Using an additional data structure.
    //using a SET
    // here I have O(n) time complexity and O(n) space complexity, because I use additional space, WHERE n = number of characters of the given String

    //2. Without using an additional data structure.
    // first, I will sort the String
    // second - verify if any neighbour characters are identical.
    // this time, time complexity is O(nlog n + n) = O(n log n ), and space complexity is O(1)

    //So, question is: what tradeoff do you want to make?

    public static boolean isUnique(String s, boolean withDS) {

        if(withDS) {

            //Set<String> mySet = new HashSet<String>(Arrays.asList(s.split("")));

            Set<String> mySet = Arrays.stream(s.split("")).collect(Collectors.toSet());

            return s.length() == mySet.size();
        }

        char [] elements =  s.toCharArray();
        Arrays.sort(elements);

        String newS = new String(elements);
        String  [] tokens = newS.split("");

        for( int i=0; i< tokens.length - 1; i++) {
            if(tokens[i].equals(tokens[i+1]))  {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String valid = "agnes";
        String invalid = "ana";

        System.out.println(isUnique(valid, true));
        System.out.println(isUnique(invalid, true));


        System.out.println(isUnique(valid, false));
        System.out.println(isUnique(invalid, false));
    }

    //2. Without using an additional data structure.

}
