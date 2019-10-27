public class LastFactorialDigit {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        for (int i = 0; i < io.getInt(); i++) {
            int k = io.getInt();
            int x = 1;
            for (int j = 1; j <= k; j++) {
                x = x * j;
            }
            System.out.println(x % 10);
        }
    }
}

