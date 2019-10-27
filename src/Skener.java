public class Skener {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int r = io.getInt(), c = io.getInt(), zr = io.getInt(), zc = io.getInt();

        char[][] input = new char[r][c];
        for (int i = 0; i < r; i++) {
            String inp = io.getWord();
            for (int j = 0; j < c; j++) {
                input[i][j] = inp.charAt(j);
            }
        }

        char[][] output = new char[r * zr][c * zc];
        for (int i = 0; i < r * zr; i++) {
            for (int j = 0; j < c * zc; j++) {
                output[i][j] = input[i/zr][j/zc];
            }
        }

        for (int i = 0; i < r * zr; i++) {
            for (int j = 0; j < c * zc; j++) {
                System.out.print(output[i][j]);
            }
            System.out.println();
        }
    }
}
