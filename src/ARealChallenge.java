//Should work, run time exception at 10th input
public class ARealChallenge {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int area = io.getInt();
        System.out.println(Math.sqrt(area)*4);
    }
}
