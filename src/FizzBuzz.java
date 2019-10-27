public class FizzBuzz {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int x = io.getInt();
        int y = io.getInt();
        int n = io.getInt();

        for (int i = 1; i <= n; i++) {
            String output = "";
            if (i % x == 0 ) {
                output += "Fizz";
            }
            if (i % y == 0) {
                output += "Buzz";
            }
            if (i % x != 0 && i % y != 0) {
                output += i;
            }
            System.out.println(output);
        }
    }
}
