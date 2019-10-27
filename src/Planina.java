public class Planina {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        double e = Math.pow(2,n)+1;
        int planina = Math.toIntExact(Math.round(Math.pow(e,2)));
        System.out.println(planina);
    }
}
