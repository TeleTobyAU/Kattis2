import java.util.HashMap;

public class BoatParts {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt(), n = io.getInt();
        HashMap<String, Boolean> partMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            partMap.put(io.getWord(), true);
            if (partMap.size() == p) {
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("paradox avoided");
    }
}