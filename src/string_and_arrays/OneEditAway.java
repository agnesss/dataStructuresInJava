package string_and_arrays;

import java.util.HashMap;

/**
 * Created by UserPC on 1/5/2018.
 */
public class OneEditAway {

    public static boolean isOneEditAway(String initial1, String initial2) {

        HashMap<String, Integer>  map = new HashMap<>();

        for(String e : initial1.split("")){
            map.put(e, 1);
        }

        int counter = 0;

        for(String e : initial2.split("")) {
            if(map.containsKey(e)) counter ++;
        }

        return counter == initial1.length()
                || counter == initial2.length();

    }

    public static void main(String[] args) {
        System.out.println(isOneEditAway("pale", "bake"));

        String testString = "alabala";

        for(int i=0; i< testString.length(); i++)
            System.out.println(testString.split("")[i]);
    }
}
