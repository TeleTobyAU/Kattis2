public class Spavanac {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int h = io.getInt();
        int m = io.getInt();

        if (h==0) {
            h=23;
            m += 15;
        } else if (m-45 < 0) {
            h-= 1;
            m = 60 + (m-45);
        } else {
            m -= 45;
        }

        System.out.println(h + " " + m);
    }
}
