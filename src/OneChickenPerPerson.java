public class OneChickenPerPerson {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt(), m = io.getInt();
        if (n >= m) {
            if (n - m != 1) {
                System.out.println("Dr. Chaz needs " + (n - m) + " more pieces of chicken!");
            } else {
                System.out.println("Dr. Chaz needs " + (n - m) + " more piece of chicken!");
            }
        } else {
            if (m - n != 1) {
                System.out.println("Dr. Chaz will have " + (m - n) + " pieces of chicken left over!");
            } else {
                System.out.println("Dr. Chaz will have " + (m - n) + " piece of chicken left over!");
            }
        }
    }
}
