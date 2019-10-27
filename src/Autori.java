public class Autori {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        StringBuilder output = new StringBuilder();
        String input = io.getWord();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                char c = input.charAt(i);
                output.append(c);
            }
        }
        System.out.println(output.toString());
    }
}
