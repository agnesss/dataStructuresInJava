package permutations;

import java.util.*;


public class Main {

    private static List<String> perm(String initial) {
        int len = initial.length();
        String latest, lastChar = "";

        if(len == 1) return Collections.singletonList(initial);

        latest = initial.substring(0, len - 1);    // the initial string without the last character
        lastChar = initial.substring(len - 1);     // last character of the String

        return insertElementAtEveryPos(lastChar, perm(latest));

    }

    private static List<String> insertElementAtEveryPos(String e, List<String> ls) {
        List<String> result = new ArrayList<>();


        for( String elem : ls) {
            for(int i=0; i< elem.length() - 1; i++)
                result.add(
                        elem.substring(0, i+1).concat(e).concat(elem.substring(i+1))
                );
            result.add(e.concat(elem));
            result.add(elem.concat(e));
        }
        return result;
    }

    /*List<String> testList = Arrays.asList("ab", "ba");
    List<String> finalRes = insertElementAtEveryPos("c", testList);*/


    public static void main(String[] args) {
        List<String> testList = Arrays.asList("ab", "ba");
        List<String> finalRes = insertElementAtEveryPos("c", testList);


         List<String> res = perm("abc");

        for( String e : res) System.out.println(e);

    }

}
