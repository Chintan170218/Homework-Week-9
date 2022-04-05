package homeworkw9;

import java.util.ArrayList;

/*
4. Write a Java program to create a new array list, add some colours (string) and
printout the collection using for each loop.
*/

public class ArrayListColour_4 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("Pink");
        list.add("Purple");
        list.add("Brown");
        list.add("Black");
        list.add("White");


        for (String colours : list){
            System.out.println(colours);


        }
    }
}