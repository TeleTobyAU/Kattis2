import java.util.*;

public class Acm {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int time = 0, solved = 0;
        HashMap<String, Integer> map = new HashMap<>();

        boolean running = true;
        while (running == true) {
            int t = io.getInt();
            String problem = io.getWord(), answer = io.getWord();
            if (t == -1) {
                running = false;
            } else {
                if (!map.containsKey(problem)) map.put(problem, 0);

                if (answer.equals("right")) {
                    time += map.get(problem)+t;
                    solved++;
                } else if (answer.equals("wrong")) {
                    map.put(problem, map.get(problem) + 20);
                }
            }
        }
        System.out.println(solved + " " + time);
    }
}
