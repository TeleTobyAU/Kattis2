public class Pot {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int num = io.getInt();
            int pow = num % 10;
            num = num / 10;
            total += Math.pow(num, pow);
        }
        System.out.println(total);
    }
}
