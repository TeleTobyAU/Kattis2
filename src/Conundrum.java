public class Conundrum {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        int n = input.length();
        int days = n-1;

        for (int i = 0; i < n; i+=2) {
            if (input.charAt(i) == 'P')  days--;
        }
        for (int i = 1; i < n; i+=2) {
            if (input.charAt(i) == 'E')  days--;
        }
        for (int i = 2; i < n; i+=2) {
            if (input.charAt(i) == 'R')  days--;
        }
        System.out.println(days);
    }
}
