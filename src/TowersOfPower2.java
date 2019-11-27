import java.math.BigInteger;
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

        LinkedHashMap<String, BigInteger> values = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            if (inputs.get(i).contains("^")) {
                ArrayList<String> nums = new ArrayList<>(Arrays.asList(inputs.get(i).split("\\D")));
                Tuple t = new Tuple(BigInteger.valueOf(Long.parseLong(nums.get(nums.size() - 2))), BigInteger.valueOf(Long.parseLong(nums.get(nums.size() - 1))));
                nums.remove(nums.size() - 1);
                nums.remove(nums.size() - 1);

                BigInteger val = t.getBigIntOne().pow(t.getBigIntTwo().intValue());
                for (int j = nums.size() - 1; j >= 0; j--) {
                    val = Tuple.pow(BigInteger.valueOf(Long.parseLong(nums.get(j))), val);
                }

                System.out.println(inputs.get(i) + " " + val);
                values.put(inputs.get(i), val);
            } else {
                System.out.println(inputs.get(i));
                values.put(inputs.get(i), BigInteger.valueOf(Long.parseLong(inputs.get(i))));
            }
        }

        ArrayList<BigInteger> nums = new ArrayList<>(values.values());
        Collections.sort(nums);
        System.out.println("Case 1:");

        for (BigInteger i : nums) {
            for (String k : values.keySet()) {
                if (values.get(k).equals(i)) {
                    System.out.println(k);
                    values.remove(k);
                    break;
                }
            }
        }
    }
}
/*
Sorter efter mængde af eksponenter
og så deres værdier
 */