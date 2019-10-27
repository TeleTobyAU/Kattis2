public class SevenWonders {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();

        int t=0, c=0, g=0;

        for (int i = 0; i < input.length(); i++) {
            char x = input.charAt(i);
            if (x == 'T') t++;
            if (x == 'C') c++;
            if (x == 'G') g++;
        }
        int ans =  Math.toIntExact(Math.round(Math.pow(t,2) + Math.pow(c,2) + Math.pow(g,2)));
        while (t > 0 && c > 0 && g > 0) {
            ans += 7;
            t--; c--; g--;
        }

        System.out.println(ans);
    }
}
