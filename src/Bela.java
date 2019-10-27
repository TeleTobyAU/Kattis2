import java.sql.SQLOutput;

public class Bela {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        String b = io.getWord();
        int points = 0;

        for (int i = 0; i < n*4; i++) {
            String hand = io.getWord();
            String suit = hand.substring(1, 2);
            String val = hand.substring(0,1);

            if (b.equals(suit)) {
                if(val.equals("A")) points += 11;
                if(val.equals("K")) points += 4;
                if(val.equals("Q")) points += 3;
                if(val.equals("J")) points += 20;
                if(val.equals("T")) points += 10;
                if(val.equals("9")) points += 14;
                if(val.equals("8")) points += 0;
                if(val.equals("7")) points += 0;
            } else {
                if(val.equals("A")) points += 11;
                if(val.equals("K")) points += 4;
                if(val.equals("Q")) points += 3;
                if(val.equals("J")) points += 2;
                if(val.equals("T")) points += 10;
                if(val.equals("9")) points += 0;
                if(val.equals("8")) points += 0;
                if(val.equals("7")) points += 0;
            }
        }
        System.out.println(points);
    }
}
