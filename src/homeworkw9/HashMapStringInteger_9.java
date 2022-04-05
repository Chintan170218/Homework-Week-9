package homeworkw9;

import java.util.HashMap;
import java.util.Map;

/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map.
*/

public class HashMapStringInteger_9 {

    public static void main(String[] args) {

        HashMap<Integer, String> list = new HashMap<>();

        list.put(1,"Yamaha");
        list.put(2,"Suzuki");
        list.put(3,"Honda");
        list.put(4,"BMW");
        list.put(5,"Ducati");
        list.put(6,"KTM");
        list.put(7,"Triumph");
        list.put(8,"Kawasaki");

        for (Map.Entry<Integer,String> bikes: list.entrySet()){

            //System.out.println(bikes.getKey()+ " = " + bikes.getValue());
            System.out.println(bikes);
        }
    }
}
