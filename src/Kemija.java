import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Kemija {
    public static void main(String[] args) {
        try {
            BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
            String input = io.readLine();
            ArrayList<Character> vowels = new ArrayList<>();
            vowels.add('a');
            vowels.add('e');
            vowels.add('i');
            vowels.add('o');
            vowels.add('u');

            String outString = "";
            for (int i = 0; i < input.length(); i++) {
                outString += input.charAt(i);
                if (vowels.contains(input.charAt(i))) {
                    i += 2;
                }
            }

            System.out.println(outString);
        } catch (Exception e) {
            System.out.println("Hejsa");
        }
    }
}
