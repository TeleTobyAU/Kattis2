import java.util.*;

public class HelpAPHD {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();

        for (int i = 0; i < n; i++) {
            String input = io.getWord();
            ArrayList<Character> list = HelperClass.stringToList(input);

            String a = "", b = "";
            boolean half = false, skipped = false;
            for (int j = 0; j < list.size(); j++) {
                char c = list.get(j);
                if (c == 'P' || c == '=' || c == 'N') {
                    if (!skipped) {
                        System.out.println("skipped");
                        skipped = true;
                    }
                } else {
                    if (c == '+') {
                        half = true;
                    } else {
                        if (!half) {
                            a += c;
                        } else {
                            b += c;
                        }
                    }
                }
                if (a.length() + b.length() == list.size()-1) System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
            }
        }
    }
}
