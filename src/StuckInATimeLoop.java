import java.util.*;
public class StuckInATimeLoop {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int x = 1;
        while (x<=i) {
            System.out.println(x + "Abracadabra");
            x++;
        }
    }
}