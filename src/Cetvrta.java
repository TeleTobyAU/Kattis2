import java.util.ArrayList;
//Fails at last input
public class Cetvrta {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        ArrayList<Integer> xval = new ArrayList<>();
        ArrayList<Integer> yval = new ArrayList<>();
        int out1 = 0;
        int out2 = 0;

        for (int i = 0; i < 3; i++) {
            xval.add(io.getInt());
            yval.add(io.getInt());
        }

        //Checking x values
        if (xval.get(0) == xval.get(1)) {
            out1 = xval.get(2);
        }
        if (xval.get(1) == xval.get(2)) {
            out1 = xval.get(0);
        }
        if (xval.get(0) == xval.get(2)) {
            out1 = xval.get(3);
        }

        //Checking y values
        if (yval.get(0) == yval.get(1)) {
            out2 = yval.get(2);
        }
        if (yval.get(1) == yval.get(2)) {
            out2 = yval.get(0);
        }
        if (yval.get(0) == yval.get(2)) {
            out2 = yval.get(1);
        }

        System.out.println(out1 + " " + out2);
    }
}
