package homeworkw9;

import java.util.ArrayList;

/*
7. Write a Java program to test an array list is empty or not. Define array list with
underground tube names.
*/

public class ArrayListUnderground_7 {

    public static void main(String[] args) {

    ArrayList<String> list = new ArrayList();
        list.add("Aldgate East Station");
        list.add("Baker Street Station");
        list.add("Bond Street Station");
        list.add("Charing Cross Station");
        list.add("Covent Garden Station");
        list.add("Holborn Station");
        list.add("Marble Arch Station");
        list.add("South Kensington Station");
        list.add("Victoria Station");
        list.add("Waterloo East Station");
        list.add("Westminster Station");

        for (String underground_tube_names : list) {
        System.out.println(underground_tube_names.isEmpty());
        }
    }
}
