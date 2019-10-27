public class DifferentDistances {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
         while (true) {
             double x1 = io.getDouble(); if (x1 == 0) return;
             double y1 = io.getDouble(), x2 = io.getDouble(), y2 = io.getDouble();
             double p = io.getDouble();

             double output = Math.pow(Math.pow(Math.abs(x1-x2), p) + Math.pow(Math.abs(y1-y2), p), 1/p);
             System.out.println(output);
         }
    }
}
