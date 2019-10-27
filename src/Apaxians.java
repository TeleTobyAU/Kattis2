import java.util.ArrayList;

public class Apaxians {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String in = io.getWord();
        int n = in.length();
        ArrayList<Character> input = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            input.add(i,in.charAt(i));
        }
        char prev = '0';
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) == prev) {
                input.remove(i);
                i -= 1;
            } else {
                prev = input.get(i);
            }
        }

        String output = "";
        for (int i = 0; i < input.size(); i++) {
            output += input.get(i);
        }

        System.out.println(output);
    }
}
