import java.util.*;

public class EstimatingCircle {
    public static void main(String[] args) {
        Kattio sc = new Kattio(System.in);
        while (true) {
            double r = sc.getDouble(), m = sc.getDouble(), c = sc.getDouble();
            if (r == 0 && m == 0 && c == 0) return;

            double actualArea = Math.pow(r, 2) * Math.PI;
            double estimateArea = (c/m)*Math.pow(2*r, 2);
            System.out.println(actualArea + " " + estimateArea);
        }
    }
}
