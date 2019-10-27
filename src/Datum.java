public class Datum {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int day = io.getInt(), mon = io.getInt(), acDay = 0;
        int even = 30, uneven = 31;


        if (mon == 1) acDay = day;
        if (mon == 2) acDay = day + 31;
        if (mon == 3) acDay = day + 31 + 28;
        if (mon == 4) acDay = day + 2 * uneven + 28;
        if (mon == 5) acDay = day + 2 * uneven + 28 + even;
        if (mon == 6) acDay = day + 3 * uneven + 28 + even;
        if (mon == 7) acDay = day + 3 * uneven + 28 + 2 * even;
        if (mon == 8) acDay = day + 4 * uneven + 28 + 2 * even;
        if (mon == 9) acDay = day + 5 * uneven + 28 + 2 * even;
        if (mon == 10) acDay = day + 5 * uneven + 28 + 3 * even;
        if (mon == 11) acDay = day + 6 * uneven + 28 + 3 * even;
        if (mon == 12) acDay = day + 6 * uneven + 28 + 4 * even;

        acDay = acDay % 7;

        if (acDay == 1) System.out.println("Thursday");
        if (acDay == 2) System.out.println("Friday");
        if (acDay == 3) System.out.println("Saturday");
        if (acDay == 4) System.out.println("Sunday");
        if (acDay == 5) System.out.println("Monday");
        if (acDay == 6) System.out.println("Tuesday");
        if (acDay == 0) System.out.println("Wednesday");
    }
}
