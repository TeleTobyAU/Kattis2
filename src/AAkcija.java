import java.util.ArrayList;
import java.util.Collections;

public class AAkcija {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        ArrayList<Integer> books = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            books.add(io.getInt());
        }
        Collections.sort(books);
        for (int i = books.size()-3; i >= 0; i -= 3) {
            books.remove(i);
        }
        int price = 0;
        for (int i = 0; i < books.size(); i++) {
            price += books.get(i);
        }
        System.out.println(price);
    }
}
