import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class TowersOfPower2 {
    public static void main(String[] args) {
        Kattio io = new Kattio(System.in);
        int n = io.getInt();
        ArrayList<String> inputs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputs.add(io.getWord());
        }

        LinkedHashMap<String, Double> values = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (inputs.get(i).contains("^")) {
                ArrayList<String> nums = new ArrayList<>(Arrays.asList(inputs.get(i).split("\\D")));
                Tuple t = new Tuple(Integer.parseInt(nums.get(nums.size() - 2)), Integer.parseInt(nums.get(nums.size() - 1)));
                nums.remove(nums.size() - 1);
                nums.remove(nums.size() - 1);

                double val = (int) Math.pow(t.getOne(), t.getTwo());
                for (int j = nums.size() - 1; j >= 0; j--) {
                    val = Math.pow(Integer.parseInt(nums.get(j)), val);
                }

                //System.out.println(inputs.get(i) + " " + val);
                values.put(inputs.get(i), val);
            } else {
                //System.out.println(inputs.get(i));
                values.put(inputs.get(i), Double.parseDouble(inputs.get(i)));
            }
        }

        ArrayList<Double> nums = new ArrayList<>(values.values());
        Collections.sort(nums);
        System.out.println("Case 1:");

        for (int i = 0; i < nums.size(); i++) {
            for (String k : values.keySet()) {
                if (values.get(k) == nums.get(i)) {
                    System.out.println(k);
                    values.remove(k);
                    break;
                }
            }
        }
    }
}
