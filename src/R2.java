
public class R2 {
    public static void main (String[] args){
        Kattio io = new Kattio(System.in);
        int r1 = 0;
        int s = 0;
        while (io.hasMoreTokens()) {
            r1 = io.getInt();
            s = io.getInt();
        }
        System.out.println(r2(r1,s));
        io.close();
    }
    
    private static int r2 (int r1, int s) {
        boolean solved = false;
        int x = 0;
        while (!solved) {
            x++;
            if ((r1 + x)/2 == s) {
                solved = true;
            }
        }
        return x;
    }
}