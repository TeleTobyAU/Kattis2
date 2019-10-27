public class QuickEstimate {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();

        for (int i = 0; i < n; i++) {
            System.out.println(HelperClass.stringToList(io.getWord()).size());
        }
    }
}
