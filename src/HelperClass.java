import java.util.*;

public class HelperClass {
    public static ArrayList<Character> stringToList(String input) {
        ArrayList<Character> output = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            output.add(input.charAt(i));
        }
        return output;
    }

    public static int sumOfDigits(int input) {
        int output = 0;
        while (input !=0) {
            output += input %10;
            input = input/10;
        }
        return output;
    }
}
