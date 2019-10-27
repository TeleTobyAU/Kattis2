import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class UnBearBaleZoo {

    public static void main(String[] args) {
        BufferedReader io = new BufferedReader(new InputStreamReader(System.in));
        try {
            int inp = Integer.parseInt(io.readLine());
            int listNum = 1;

            while (true) {
                if (inp == 0) return;
                HashMap<String, Integer> animalMap = new HashMap<>();

                for (int i = 0; i < inp; i++) {
                    String animal = io.readLine();
                    String currAnimal = animal.substring(animal.lastIndexOf(" ") + 1).strip().toLowerCase();

                    if (animalMap.containsKey(currAnimal)) {
                        int currAmount = animalMap.get(currAnimal);
                        animalMap.put(currAnimal, currAmount + 1);
                    } else {
                        animalMap.put(currAnimal, 1);
                    }
                }

                System.out.println("List " + listNum + ":");
                List keySet = Arrays.asList(animalMap.keySet().toArray());
                Collections.sort(keySet);
                for (int i = 0; i < keySet.size(); i++) {
                    String animal = (String) keySet.toArray()[i];
                    System.out.println(animal + " | " + animalMap.get(animal));
                }

                inp = Integer.parseInt(io.readLine());
                listNum++;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}