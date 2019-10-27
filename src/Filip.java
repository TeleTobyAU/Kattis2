public class Filip {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int a = io.getInt();
        int b = io.getInt();
        int na = 0;
        int nb = 0;

        for (int i =0; i<3; i++){
            na = na *10 + (a%10);
            nb = nb *10 + (b%10);
            a = a/10;
            b = b/10;
        }
        if (na < nb) {
            System.out.println(nb);
        } else {
            System.out.println(na);
        }
    }
}
