import java.util.ArrayList;
import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        ArrayList<User> userArr = new ArrayList<>();

        userArr.add(new User("Birdperson", 49));
        userArr.add(new User("Summer", 52));
        userArr.add(new User("Beth", 33));
        userArr.add(new User("Jerry", 29));
        userArr.add(new User("Rick", 70));
        userArr.add(new User("Morty", 25));


        HashMap<Integer, User> userMap = MapEditor.generator(userArr);

        System.out.println(userMap);


        ArrayList<User> oddValues = new ArrayList<>();
        ArrayList<User> evenValues = new ArrayList<>();

        MapEditor.oddEven(userMap,oddValues,evenValues);

        System.out.println();

        System.out.println("Values of odd keys: " + oddValues);
        System.out.println("Values of even keys: " + evenValues);

    }
}
