import java.util.ArrayList;

public class Yoda {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int num1 = io.getInt();
        int num2 = io.getInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> output1 = new ArrayList<>();
        ArrayList<Integer> output2 = new ArrayList<>();

        //Split up both numbers and add individual ciffers to a list
        while (num1 != 0) {
            list1.add(num1%10);
            num1 = num1/10;
        }
        while (num2 != 0) {
            list2.add(num2%10);
            num2 = num2/10;
        }

        //Add the numbers to save to new lists
        for (int i = 0; i < list1.size(); i++) {
            int no1, no2;
            no1 = list1.get(i);
            no2 = list2.get(i);

            if (no1 > no2) output1.add(no1);
            if (no2 > no1) output2.add(no2);
            if (no1 == no2) {
                output1.add(no1);
                output2.add(no2);
            }
        }

        //Get the lists back to integers
        int out1 = 0;
        int out2 = 0;

        for (int i = 0; i < output1.size(); i++) {
            out1 += output1.get(i);
            out1 = out1 * 10;
        }
        for (int i = 0; i < output2.size(); i++) {
            out2 += output2.get(i);
            out2 = out2 * 10;
        }

        //Print the integers
        if (output1.size() == 0) {
            System.out.println("YODA");
        } else {
            System.out.println(out1);
        }
        if (output2.size() == 0) {
            System.out.println("YODA");
        } else {
            System.out.println(out2);
        }
    }
}
