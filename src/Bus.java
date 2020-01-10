public class Bus {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        for (int i = 0; i < n; i++) {
            System.out.println(io.getInt()*2+1);
        }
    }
}
