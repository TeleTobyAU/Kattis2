public class DRMMessages {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        String input = io.getWord();
        int divPoint = input.length()/2;

        //Divide
        String lHalf = input.substring(0,divPoint);
        String rHalf = input.substring(divPoint);

        int lRVal = 0;
        for (int i = 0; i < lHalf.length(); i++) {
            char currChar = lHalf.charAt(i);
            int currCharNum = currChar-65;
            lRVal += currCharNum;
        }

        int rRVal = 0;
        for (int i = 0; i < rHalf.length(); i++) {
            char currChar = rHalf.charAt(i);
            int currCharNum = currChar-65;
            rRVal += currCharNum;
        }

        //Rotate
        lHalf = rotate(lHalf, lRVal);
        rHalf = rotate(rHalf, rRVal);

        //Merge
        String outString = "";
        for (int i = 0; i < lHalf.length(); i++) {
            outString += rotate(Character.toString(lHalf.charAt(i)), (int) rHalf.charAt(i)-65);
        }
        System.out.println(outString);
    }

    private static String rotate(String inp, int num) {
        String str = inp;
        String returnString = "";

        char[] chars = str.toCharArray();
        for (Character c : chars) {
            int cNum = (c - 65 + num)%26 + 65;
            returnString += Character.toString((char) cNum);
        }

        return returnString;
    }
}
