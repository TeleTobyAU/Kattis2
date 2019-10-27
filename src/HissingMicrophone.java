public class HissingMicrophone {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == 's' && input.charAt(i+1) == 's') {
                System.out.println("hiss");
                return;
            }
        }
        System.out.println("no hiss");
    }
}
