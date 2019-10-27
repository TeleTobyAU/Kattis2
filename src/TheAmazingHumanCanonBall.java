import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheAmazingHumanCanonBall {
    public static void main(String[] args) {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(io.readLine());
            double g = 9.81;
            for (int i = 0; i < n; i++) {
                String[] input = io.readLine().split("\\s+");
                double v = Double.parseDouble(input[0]);
                double theta = Double.parseDouble(input[1]);
                double x = Double.parseDouble(input[2]);
                double h1 = Double.parseDouble(input[3]);
                double h2 = Double.parseDouble(input[4]);

                double t = x / (v * Math.cos(theta * Math.PI / 180.0));
                double y = v * t * Math.sin(theta * Math.PI / 180.0) - ((1 / 2.0) * g * t * t);

                if (y + 1 < h2 && y - 1 > h1) {
                    System.out.println("Safe");
                } else {
                    System.out.println("Not Safe");
                }
            }
        } catch (Exception e) {
            System.out.println("Fuuuuuuuuuuuuuck");
        }
    }
}