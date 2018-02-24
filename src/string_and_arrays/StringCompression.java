package string_and_arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by UserPC on 1/5/2018.
 */
public class StringCompression {

    public static String gimmeTheCompressedString(String givenString) {

        List<Info> result = new ArrayList<>();

        int i = 0;
        int j;

        String [] tok = givenString.split("");


        while (i < givenString.length() - 1) {
            j = i + 1;
            int counter = 1;

            while(j < givenString.length() && tok[i].equals(tok[j])) {
                counter++;
                j++;
            }

            result.add(new Info(tok[i], counter));
            i = j;
        }

        StringBuilder  sb = new StringBuilder();

        for(Info info : result) {
            sb.append(info.getKey()).append(info.getValue());
        }

        return sb.toString();
    }

    private static class Info {
        private String key;
        private int value;

        Info(String key, int value) {
            this.key = key;
            this.value = value;
        }

        public java.lang.String getKey() {
            return key;
        }

        public void setKey(java.lang.String key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }


    public static void main(String[] args) {
        System.out.println(gimmeTheCompressedString("aabcccccaaa"));
    }
}
