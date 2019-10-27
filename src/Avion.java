public class Avion {

    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String outString = "";
        for (int i = 0; i < 5; i++) {
            String input = io.getWord();
            if (input.contains("FBI")) {
                outString += (i + 1) + " ";
            }
        }
        if (outString.length() != 0) {
            System.out.println(outString);
        } else {
            System.out.println("HE GOT AWAY!");
        }
    }
}
