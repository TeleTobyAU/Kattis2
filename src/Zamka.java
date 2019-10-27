public class Zamka {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int l = io.getInt();
        int d = io.getInt();
        int x = io.getInt();
        boolean solved = false;

        //Find n, starting from l and going up
        int i = l;
        while (!solved) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
                }
            if (sum == x) {
                System.out.println(i);
                solved = true;
            }
            i++;
        }
        //Find m, starting from d and going down
        i = d;
        solved = false;
        while (!solved) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum = sum + num % 10;
                num = num / 10;
                }
            if (sum == x) {
                System.out.println(i);
                solved=true;
            }
            i--;
        }
    }
}