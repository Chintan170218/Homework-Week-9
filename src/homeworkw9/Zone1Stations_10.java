package homeworkw9;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Zone1Stations_10
{

    public static void main(String[] args) {
        stations();

    }
    public static void stations() {
        char c = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter station name between A and G: ");
        String sname = sc.nextLine().toLowerCase(Locale.ROOT);

        if (sname.equals("Aldgate")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitan");
            list.add("Circle");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }

        } else if (sname.equals("Aldgate east")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Hammersmith & City");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));

            }
        } else if (sname.equals("Angel")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Baker street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Circle");
            list.add("Hammersmith & city");
            list.add("Jubilee");
            list.add("Metropolitan");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Bank")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");
            list.add("DLR");
            list.add("Northern");
            list.add("Waterloo & City");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Barbican")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitan");
            list.add("Circle");
            list.add("Hammersmith & city");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Battersea Power Station")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Bayswater")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Blackfriars")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");


            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Bond street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");
            list.add("Jubilee");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Borough")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Cannon street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("District");
            list.add("Circle");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Chancery lane")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Central");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Charing cross")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Covent garden")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Piccadilly");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Edgware road")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("elephant castle")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("embankment")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Bakerloo");
            list.add("Circle");
            list.add("Northern");
            list.add("District");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Euston")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Victoria");
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("euston square")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Metropolitan");
            list.add("Circle");
            list.add("Hammersmith & City");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Farringdon")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Circle");
            list.add("Hammersmith & City");
            list.add("Metropolitan");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Gloucester street")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Northern");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else if (sname.equals("Green park")) {
            ArrayList<String> list = new ArrayList<>();
            list.add("Jubilee");
            list.add("Piccadilly");
            list.add("Victoria");

            for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i));
            }
        } else
            System.out.println("Please enter a valid station name");
    }

}

