public class Checkerboard {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        String[] inputs = new String[n];
        for (int i = 0; i < n; i++) {
            String input = io.getWord();
            if (input.contains("WWW") || input.contains("BBB")) {
                System.out.println(0);
                return;
            }

            int w = 0, b = 0;
            for (int j = 0; j < n; j++) {
                if (input.charAt(j) == 'W') w++;
                if (input.charAt(j) == 'B') b++;
            }
            if (w != b) {
                System.out.println(0);
                return;
            }

            inputs[i] = input;
        }

        for (int i = 0; i < n; i++) {
            String input = "";
            for (int j = 0; j < n; j++) {
                input += inputs[j].charAt(i);
            }
            if (input.contains("WWW") || input.contains("BBB")) {
                System.out.println(0);
                return;
            }

            int w = 0, b = 0;
            for (int j = 0; j < n; j++) {
                if (input.charAt(j) == 'W') w++;
                if (input.charAt(j) == 'B') b++;
            }
            if (w != b) {
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}
