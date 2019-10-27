public class JudgingMoose {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int l = io.getInt();
        int r = io.getInt();

        if (l == r && l != 0 && r != 0) System.out.println("Even " + (l+r));
        if (l != r)  {
            if (r > l) System.out.println("Odd " + 2*r);
            if (l > r) System.out.println("Odd " + 2*l);
        }
        if (l== 0 && r == 0) System.out.println("Not a moose");
    }
}
