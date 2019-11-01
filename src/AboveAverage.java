import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AboveAverage {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            double m = io.getDouble();
            double avg = 0;
            double[] grades = new double[(int) m];
            for (int j = 0; j < m; j++) {
                double currGrade = io.getInt();
                avg += currGrade;
                grades[j] = currGrade;
            }
            avg = avg/m;

            double totAbv = 0;
            for (int j = 0; j < grades.length; j++) {
                if (grades[j] > avg) totAbv++;
            }

            double totAbvPer = Math.round(((totAbv / m) * 100.0) * 1000d) / 1000d;
            DecimalFormat df = new DecimalFormat("#0.000");
            String out = df.format(totAbvPer) + "%";
            for (int j = 0; j < out.length(); j++) {
                char currChar = out.charAt(j);
                if (currChar == ',') {
                    System.out.print(".");
                } else {
                    System.out.print(currChar);
                }
            }
            System.out.println();
        }
    }
}
