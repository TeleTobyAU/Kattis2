import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuiteAProblem {
    public static void main(String[] args) {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (true) {
                String input = io.readLine();
                if (input.toLowerCase().contains("problem")) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        } catch (Exception e) {

        } finally {
            return;
        }
    }
}
