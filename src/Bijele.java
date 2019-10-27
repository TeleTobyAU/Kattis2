public class Bijele {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int king = io.getInt();
        int queen = io.getInt();
        int rook = io.getInt();
        int bishop = io.getInt();
        int knight = io.getInt();
        int pawn = io.getInt();

        System.out.println(-(king -1) + " " + -(queen -1) +" "+ -(rook -2) +" "+
                -(bishop -2) +" "+ -(knight-2) +" "+ -(pawn -8));

    }
}
