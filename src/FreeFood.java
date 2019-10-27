import java.util.HashSet;

public class FreeFood {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        HashSet<Integer> daysCovered = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int startDate = io.getInt(), endDate = io.getInt();
            for (int j = startDate; j <= endDate; j++) {
                daysCovered.add(j);
            }
        }
        System.out.println(daysCovered.size());
    }
}
