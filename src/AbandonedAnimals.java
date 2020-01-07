public class AbandonedAnimals {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), k = io.getInt();

        String items = "", stores = "";

        for (int i = 0; i < k; i++) {
            io.getWord();
            stores += io.getWord();
        }

        int m = io.getInt();
        for (int i = 0; i < m; i++) {
            items += io.getWord();
        }

        System.out.println(stores);
        System.out.println(items);

        if (stores.equals(items)) {
            System.out.println("unique");
            return;
        }
        if (stores.contains(items)) {
            System.out.println("ambiguous");
            return;
        }
        System.out.println("impossible");
    }
}
