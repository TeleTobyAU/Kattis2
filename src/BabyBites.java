public class BabyBites {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();

        int prev = 0;
        boolean fishy = false;
        for (int i = 0; i < n; i++) {
            String input = io.getWord();
            if (input.equals("mumble")) {
                prev++;
            } else {
                prev = Integer.parseInt(input);
                if (i+1 != prev) fishy = true;
            }
        }
        if (fishy) {
            System.out.println("something is fishy");
        } else {
            System.out.println("makes sense");
        }
    }
}
