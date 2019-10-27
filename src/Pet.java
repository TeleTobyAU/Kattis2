import java.util.HashMap;

public class Pet {
    private static HashMap<Integer, Integer> map;
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            int points = 0;
            for (int j = 0; j < 4; j++) {
                points += io.getInt();
            }
            map.put(i,points);
        }
        int bestc = 0;
        int bestcp = 0;
        for (int i = 0 ; i < 5 ; i++) {
            if (map.get(i) > bestcp) {
                bestcp = map.get(i);
                bestc = i;
            }
        }
        System.out.println(bestc+1 + " " + map.get(bestc));
    }
}
