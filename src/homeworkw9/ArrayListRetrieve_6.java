package homeworkw9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
6. Write a Java program to retrieve an element (at a specified index) from a given
array list.
*/

public class ArrayListRetrieve_6 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Bottle");
        list.add("Cream");
        list.add("Fridge");
        list.add("Card");
        list.add("Cable");
        list.add("Stapler");
        list.add("Speakers");
        list.add("Tape");
        list.add("Monitor");
        list.add("Pen");

        System.out.println(list);

        String element = list.get(0);
        System.out.println("1st element: " + element);
        element = list.get(2);
        System.out.println("3rd element: " + element);

    }
}