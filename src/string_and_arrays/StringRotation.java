package string_and_arrays;

/**
 * Created by UserPC on 1/5/2018.
 */
public class StringRotation {

   public static boolean isRotation (String actual, String expected) {

       char first = actual.charAt(0); //first character from the 1st string

       int pos = expected.indexOf(first); //the position of the first character in the second string

       String commonPart =  actual.substring(pos);

       return isSubstring(commonPart, expected);
   }

   private static boolean isSubstring(String substring, String wholeString) {
       return wholeString.contains(substring);
   }

    public static void main(String[] args) {
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }
}
