import java.util.*;

public class Modulo {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();

        while (io.hasMoreTokens()) {
            int in = io.getInt();
            map.put(in%42, in);
        }
        System.out.println(map.size());
    }
}
