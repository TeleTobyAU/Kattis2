import jdk.nashorn.api.tree.*;

import java.util.*;

public class RunLengthEncodingRun {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String c = io.getWord();
        String input = io.getWord();

        if (c.equals("E")) {
            System.out.println(encode(input));
        }

        if (c.equals("D")) {
            System.out.println(decode(input));
        }
    }

    public static String encode(String string) {
         StringBuilder builder = new StringBuilder();
        char[] chars = string.toCharArray();
        char current = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (current == chars[i]){
                count++;
            } else {
                builder.append(current);
                builder.append(count);
                current = chars[i];
                count = 1;
            }
        }
        builder.append(current);
        builder.append(count);
        return builder.toString();
    }

    public static String decode(String string) {
        ArrayList<Character> list = HelperClass.stringToList(string);
        String output = "";

        for (int i = 0; i < list.size(); i+=2) {
            char curr = list.get(i);
            int n = list.get(i+1) - '0';
            for (int j = 0; j < n; j++) {
                output += curr;
            }
        }

        return output;
    }
}
