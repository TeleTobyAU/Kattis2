public class PizzaCrust {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int r = io.getInt(), c = io.getInt();

        double pizzaArea = Math.pow(r, 2) * Math.PI;
        double cheeseArea = Math.pow(r-c, 2) * Math.PI;
        double cheesePerc = cheeseArea/pizzaArea * 100;

        System.out.println(cheesePerc);
    }
}
