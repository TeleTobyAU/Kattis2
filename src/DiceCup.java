public class DiceCup {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int die1 = io.getInt();
        int die2 = io.getInt();

        if (die1 < die2) {
            int diff = Math.abs(die1 - die2);

            for (int i = die1+1; i <= die1 + diff + 1; i++) {
                System.out.println(i);
            }
        }

        if (die1 > die2) {
            int temp = die1;
            die1 = die2;
            die2 = temp;
            int diff = Math.abs(die1 - die2);

            for (int i = die1; i <= die1 + diff; i++) {
                System.out.println(i+1);
            }
        }

        if (die1 == die2) {
            System.out.println(die1+1);
        }
    }
}