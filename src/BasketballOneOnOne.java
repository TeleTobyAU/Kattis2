public class BasketballOneOnOne {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        char[] input = io.getWord().toCharArray();

        int a = 0, b = 0;
        for (int i = 0; i < input.length; i += 2) {
            if (input[i] == 'A') a += Integer.parseInt("" + input[i+1]);
            if (input[i] == 'B') b += Integer.parseInt("" + input[i+1]);

            if (a >= 11 && b <= 9) {
                System.out.println("A");
            }
            else if (b >= 11 && a <= 9) {
                System.out.println("B");
            }
            else if (a > 11 || b > 11) {
                if (a >= b + 2) {
                    System.out.println("A");
                }
                else if (b >= a + 2) {
                    System.out.println("B");
                }
            }
        }
    }
}
