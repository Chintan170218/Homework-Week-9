package homeworkw9;

import java.util.ArrayList;
import java.util.List;

/*
5. Write a Java program to iterate through all elements in an array list using
Iterator.
*/

public class ArrayListWithIterator_5 {

    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Pink");
        list.add("Purple");
        list.add("Brown");
        list.add("Black");
        list.add("White");


        for (String element : list) {
            System.out.println(element);
        }
    }
}