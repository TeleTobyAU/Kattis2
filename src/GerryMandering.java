import java.util.HashMap;

public class GerryMandering {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int p = io.getInt(), d = io.getInt();
        HashMap<Integer, Tuple> votes = new HashMap<>();
        for (int i = 0; i < p; i++) {
            int precicnt = io.getInt();
            if (votes.containsKey(precicnt)) {
                votes.put(precicnt, new Tuple(
                        votes.get(precicnt).getOne() + io.getInt(),
                        votes.get(precicnt).getTwo() + io.getInt()));
            } else {
                votes.put(precicnt, new Tuple(io.getInt(), io.getInt()));
            }
        }

        long wA = 0;
        long wB = 0;
        int totVotes = 0;

        for (int i = 1; i < d+1; i++) {
            long a = votes.get(i).getOne();
            long b = votes.get(i).getTwo();
            totVotes += a + b;
            //System.out.println("A: " + a + " B: " + b);
            if (a > b) {
                int wa = (int) (a - (Math.floorDiv((a + b) , 2) + 1));
                wA += wa;
                wB += b;
                System.out.print("A " + wa + " " + b);
            } else {
                int wb = (int) (b - (Math.floorDiv((a + b) , 2) + 1));
                wB += wb;
                wA += a;
                System.out.print("B " + a + " " + wb);

            }
            System.out.println();
        }
        //System.out.println("wA: " + wA + " wB: " + wB + " total: " + totVotes);
        System.out.println((double) Math.abs(wA - wB) / totVotes);
    }
}
