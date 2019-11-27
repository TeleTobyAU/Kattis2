public class SomeSum {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int i = io.getInt();
        if ((i % 2) == 0){
            System.out.println("Odd");
        }
        else {
            System.out.println("Either");
        }
    }
}
