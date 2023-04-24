import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        //TESTING DEMO
        System.out.println("Hello, World!");
        ArrayList<Coordinates> list = new ArrayList<Coordinates>();
        list.add(new Coordinates("A", -84.032126, 34.071238));
        list.add(new Coordinates("B", -84.032041, 34.070831));
        list.add(new Coordinates("C", -84.031311, 34.071022));
        list.add(new Coordinates("D", -84.031433, 34.070442));

        Coordinates destination = new Coordinates("ME", -84.031479, 34.070914);

        minDistance(list, destination);
    }

    public static void printCoordinates(Coordinates coordinates) {
        System.out.println("Name: " + coordinates.getName());
        System.out.println("Lang: " + coordinates.getLon());
        System.out.println("Lat: " + coordinates.getLat());
    }
    public static double distance(Coordinates origin , Coordinates destination) {
        double lat1 = origin.getLat();
        double lat2 = destination.getLat();
        double lon1 = origin.getLon();
        double lon2 = destination.getLon();
        //We are ignoring height difference when calculating distance for distance using lat and long
        double height = 0;
        final int R = 6371; // Radius of the earth
        
        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
            + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c * 1000; // convert to meters
        

    distance = Math.pow(distance, 2) + Math.pow(height, 2);

    return Math.sqrt(distance);
    }

    public static void minDistance(ArrayList<Coordinates> origin, Coordinates destination) {
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < origin.size(); i++) {
            double temp = distance(origin.get(i), destination);
            if (temp < min) {
                min = temp;
            }
        }

        for(int i = 0; i < origin.size(); i++) {
            double temp = distance(origin.get(i), destination);
            if (temp == min) {
                System.out.println("The closest point with the distance of "
                 + min +" meter is: ");
                printCoordinates(origin.get(i));
            }
        }
    }
       
}
