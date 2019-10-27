public class Faktor {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int x = io.getInt();
        int y = io.getInt();
        System.out.println((x*(y-1))+1);
    }
}
