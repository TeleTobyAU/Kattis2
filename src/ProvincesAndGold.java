public class ProvincesAndGold {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int g = io.getInt(), s = io.getInt(), c = io.getInt();
        int m = g*3 + s*2 + c;
        String output = "";

        if (m >= 8) {
            output += "Province";
        } else if (m >= 5) {
            output += "Duchy";
        } else if (m >= 2) {
            output += "Estate";
        }
        if (output.length() > 2) {
            if (m >= 6) {
                output += " or Gold";
            } else if (m >= 3) {
                output += " or Silver";
            } else if (m >= 0) {
                output += " or Copper";
            }
        }
        if (output.length() == 0) {
            output += "Copper";
        }
        System.out.println(output);
    }
}
