public class Conondrum {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        int days = 0;

        days += checkChar(input, 0, 'P');
        days += checkChar(input, 1, 'E');
        days += checkChar(input, 2, 'R');

        System.out.println(days);
    }

    private static int checkChar(String inp, int startInt, char desiredChar) {
        int returnInt = 0;
        for (int i = startInt; i < inp.length(); i+=3) {
            if (inp.charAt(i) != desiredChar) {
                returnInt++;
            }
        }

        return returnInt;
    }
}
