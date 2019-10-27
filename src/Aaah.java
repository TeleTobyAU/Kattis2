public class Aaah {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String jon = io.getWord(), doc = io.getWord();

        if (jon.length() < doc.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}
