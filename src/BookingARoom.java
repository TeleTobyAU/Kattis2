import java.util.ArrayList;

public class BookingARoom {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int r = io.getInt(), n = io.getInt();
        ArrayList<Integer> bookedRooms = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            bookedRooms.add(io.getInt());
        }

        if (n == r) {
            System.out.println("too late");
        } else {
            for (int i = 1; i < r+1; i++) {
                if (!bookedRooms.contains(i)) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
