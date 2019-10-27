import java.util.ArrayList;

public class LostLineup {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        ArrayList<Integer> theLine = new ArrayList<>();
        theLine.add(1);
        for (int i = 0; i < n - 1; i++) {
            theLine.add(2+io.getInt(), i);
        }

        for (int i = 0; i < theLine.size(); i++) {
            System.out.println(theLine.get(i) + " ");
        }
    }
}
