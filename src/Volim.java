public class Volim {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int k = io.getInt(), n = io.getInt();
        int currPlayer = k - 1, time = 0;
        for (int i = 0; i < n; i++) {
            time += io.getInt();
            String answer = io.getWord();
            if (time >= 210) {
                break;
            } else if (answer.equals("T")) {
                currPlayer = (currPlayer + 1) % 8;
            }
        }
        System.out.println(currPlayer + 1);
    }
}
