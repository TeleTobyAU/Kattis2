public class Tri {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int a = io.getInt(), b = io.getInt(), c = io.getInt();

        if (a+b==c) {
            System.out.println(a+"+"+b+"="+c);
            return;
        }
        if (a-b==c) {
            System.out.println(a+"-"+b+"="+c);
            return;
        }
        if (a/b==c) {
            System.out.println(a+"/"+b+"="+c);
            return;
        }
        if (a*b==c) {
            System.out.println(a+"*"+b+"="+c);
            return;
        }
        if (a==b+c) {
            System.out.println(a+"="+b+"+"+c);
            return;
        }
        if (a==b-c) {
            System.out.println(a+"="+b+"-"+c);
            return;
        }
        if (a==b/c) {
            System.out.println(a+"="+b+"/"+c);
            return;
        }
        if (a==b*c) System.out.println(a+"="+b+"*"+c);
    }
}
