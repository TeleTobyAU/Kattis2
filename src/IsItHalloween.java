public class IsItHalloween {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String month = io.getWord();
        String day = io.getWord();
        if (month.equals("OCT") && day.equals("31")) {
            System.out.println("yup");
            return;
        }
        if (month.equals("DEC") && day.equals("25")) {
            System.out.println("yup");
            return;
        }
        System.out.println("nope");
    }
}
