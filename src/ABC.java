import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ABC {
    public static void main(String[] args) {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] numbers = io.readLine().split("\\s+");
            ArrayList<Integer> nums = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                nums.add(Integer.parseInt(numbers[i]));
            }

            Collections.sort(nums);
            String letters = io.readLine();
            String outString = "";

            for (int i = 0; i < 3; i++) {
                if (letters.charAt(i) == 'A') {
                    outString += nums.get(0);
                }
                if (letters.charAt(i) == 'B') {
                    outString += nums.get(1);
                }
                if (letters.charAt(i) == 'C') {
                    outString += nums.get(2);
                }
                outString += " ";
            }

            System.out.println(outString);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
