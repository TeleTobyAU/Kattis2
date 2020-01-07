import java.math.*;

public class Sjecista {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        System.out.println(fac(n).divide(fac(4).multiply(fac(n-4))));
    }

    private static BigInteger fac(int number) {
        BigInteger fact = BigInteger.ONE;
        for(int i = 1; i <= number; i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
