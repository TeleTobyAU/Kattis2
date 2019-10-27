import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class ICPCAwards {
    public static void main(String[] args) {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        try {
            String n = io.readLine();
            LinkedHashMap<String, String> uniMap = new LinkedHashMap<>();
            while (uniMap.size() < 12) {
                String currTeam = io.readLine();
                if (!uniMap.containsKey(currTeam.split("\\s+")[0])) {
                    uniMap.put(currTeam.split("\\s+")[0], currTeam);
                }
            }
            for (String s : uniMap.keySet()) {
                System.out.println(uniMap.get(s));
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}