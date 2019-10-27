public class QuadrantSelection {
    public static void main (String[] args){
        Kattio io = new Kattio(System.in);
        int x = io.getInt();
        int y = io.getInt();
        if (x > 0 && y > 0) {
            System.out.println(1);
        }
        if (x < 0 && y > 0) {
            System.out.println(2);
        }
        if (x < 0 && y < 0) {
            System.out.println(3);
        }
        if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }
}