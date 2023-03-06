import java.util.*;

public class MapEditor {
    static HashMap<Integer, User> generator(ArrayList<User> arr) {
        HashMap<Integer, User> map = new HashMap<>();
        Random rand = new Random();
        int i = 0;

        for (User a : arr) {
            i = rand.nextInt(100);
            map.put(i, a);
        }
        return map;
    }

    static void oddEven(HashMap<Integer, User> map , ArrayList<User> odd, ArrayList<User> even) {

        for (Map.Entry<Integer, User> set : map.entrySet()) {
            if (set.getKey() % 2 == 0) {
                even.add(set.getValue());
            } else {
                odd.add(set.getValue());
            }
        }

    }

}
