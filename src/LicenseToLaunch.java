import java.lang.reflect.*;
import java.util.*;

public class LicenseToLaunch {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(io.getInt());
        }

        int smallest = Integer.MAX_VALUE;
        for (Integer i: list) {
            if (i < smallest) {
                if (smallest == i) {
                    System.out.println(list.indexOf(i));
                    return;
                }
                smallest = i;
            }
        }
        System.out.println(list.indexOf(smallest));
    }
}
