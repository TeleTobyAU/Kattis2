import java.util.*;

public class EncodedMessage {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            String input = io.getWord();

            //Find the table size, size is h*h
            int h = 0;
            while (Math.pow(h,2) != input.length()) h++;

            //Converts the string to a list of chars
            ArrayList<Character> in = HelperClass.stringToList(input);

            //Add every h'th element in in to out, and do it h times
            //Not working
            ArrayList<Character> out = new ArrayList<>();
            for (int j = 0; j < h; j++) {
                for (int k = (h-1)-j; k < in.size(); k += h) {
                    out.add(in.get(k));
                }
            }

            //Converts list back to string
            String output = "";
            for (Character c: out) {
                output += c;
            }

            System.out.println(output);
        }
    }
}
