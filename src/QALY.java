import java.util.*;
public class QALY {
    public static void main (String[] args){
        Kattio io = new Kattio(System.in);
        boolean solved = false;
        int periods = io.getInt();
        double kval = 0;
 
            for (int i = 0; i<periods; i++) {
                double qual = io.getDouble();
                double time = io.getDouble();
                kval += qual*time;
            }
        
        System.out.println(kval);
    }
}