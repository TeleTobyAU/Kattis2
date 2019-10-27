public class Cold {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        int days = 0;

        for (int i = 0; i < n; i++) {
            if(io.getInt() < 0) days++;
        }
        System.out.println(days);
    }
}
