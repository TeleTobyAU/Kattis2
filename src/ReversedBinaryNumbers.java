public class ReversedBinaryNumbers {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        String num = Integer.toBinaryString(n);
        String flippedNum = "";

        for (int i = num.length()-1; i >= 0; i--) {
            flippedNum += num.charAt(i);
        }

        System.out.println(Integer.parseInt(flippedNum, 2));
    }
}
