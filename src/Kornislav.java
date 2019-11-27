import java.util.ArrayList;
import java.util.Collections;

public class Kornislav {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int a = io.getInt(), b = io.getInt(), c = io.getInt(), d = io.getInt();
        ArrayList<Integer> lenghts = new ArrayList<>();
        lenghts.add(a);
        lenghts.add(b);
        lenghts.add(c);
        lenghts.add(d);

        Collections.sort(lenghts);

        System.out.println(lenghts.get(0) * lenghts.get(2));
    }
}
