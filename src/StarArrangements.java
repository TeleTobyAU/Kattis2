public class StarArrangements {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int s = io.getInt();
        System.out.println(s + ":");
        for (int i = 2; i < s / 2; i++) {
            for (int j = i - 1; j < i + 1; j++) {
                if (s % (i + j) == 0) {
                    System.out.println(i + "," + j);
                }
            }
        }
    }
}
