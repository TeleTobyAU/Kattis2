//Fails on 4th input
public class SodaSlurper {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int e = io.getInt(), f = io.getInt(), c = io.getInt();
        int drunkBottles = (e + f) / c, currBottles = (e + f) / c;

        while (currBottles >= c) {
            drunkBottles++;
            currBottles -= c;
            currBottles++;
        }

        System.out.println(drunkBottles);
    }
}