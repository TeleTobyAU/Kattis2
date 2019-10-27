public class NumberFun {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();

        for (int i = 0; i < n; i++) {
            double a = io.getInt(), b = io.getInt();
            double ans = io.getInt();

            if (a+b == ans || Math.abs(a-b) == ans || a*b == ans || a/b == ans || b/a == ans) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }
}
