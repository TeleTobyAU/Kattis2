public class Easiest {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = -1;
        while (true) {
            n = io.getInt();
            if (n==0) return;
            int intSum = HelperClass.sumOfDigits(n);

            Boolean solved = false;
            int i = 11;
            while (!solved) {
                if (intSum == HelperClass.sumOfDigits(n*i)) {
                    System.out.println(i);
                    solved = true;
                }
                i++;
            }
        }
    }
}
