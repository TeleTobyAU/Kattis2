import jdk.nashorn.api.tree.*;

import java.util.*;

public class DetailedDifferences {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();

        for (int i = 0; i < n; i++) {
            String inp1 = io.getWord(), inp2 = io.getWord();
            ArrayList<Character> list1 = HelperClass.stringToList(inp1);
            ArrayList<Character> list2 = HelperClass.stringToList(inp2);

            String output = "";
            for (int j = 0; j < list1.size(); j++) {
                if (list1.get(j) == list2.get(j)) output += '.';
                if (list1.get(j) != list2.get(j)) output += '*';
            }
            System.out.println(inp1);
            System.out.println(inp2);
            System.out.println(output);
            System.out.println();
        }
    }
}
