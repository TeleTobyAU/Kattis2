import java.util.*;
public class Stone {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i%2 == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }
    }
}