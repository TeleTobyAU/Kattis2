import java.util.*;

public class Zoo {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        TreeMap<String, Integer> map = new TreeMap<>();

        boolean running = true;
        int listNo = 1;
        while (running) {
            int n = Integer.parseInt(io.getWord());
            if (n == 0) {
                running = false;
            } else {
                for (int i = 0; i < n; i++) {
                    boolean s = false;
                    while (!s) {
                        String input = io.getWord();
                        if (Character.isLowerCase(input.charAt(0))) {
                            if (!map.containsKey(input)) {
                                map.put(input, 1);
                            } else {
                                map.put(input, map.get(input) + 1);
                                System.out.println("input " + input);
                                s = true;
                            }
                        }
                    }
                }
            }
            System.out.println("List " + listNo + ":");
            for (String s : map.keySet()) {
                System.out.println(s + " | " + map.get(s));
            }
            listNo++;
        }
    }
}