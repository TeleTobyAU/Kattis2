public class HarshadNumbers {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String num = io.getWord();

        int i = Integer.parseInt(num);
        while (true) {
            if (isHarshad(i + "")) {
                System.out.println(i);
                return;
            }
            i++;
        }
    }

    private static boolean isHarshad(String number) {
        int divNum = 0;
        for (int i = 0; i < number.length(); i++) {
            divNum += Integer.parseInt("" + number.charAt(i));
        }

        if ((Integer.parseInt(number) % divNum) == 0) return true;

        return false;
    }
}
