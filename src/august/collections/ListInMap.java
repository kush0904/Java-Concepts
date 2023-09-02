package august.collections;

import java.util.*;


public class ListInMap {

    public static void main(String[] args) {
        Map<String, List<String>> mapDetails = new HashMap<>(); //pass object of arraylist to map
        List<String> listDetails = new ArrayList<>();

        mapDetails.put("12345",listDetails);  //pass the list object to the map in the beginning
        mapDetails.get("12345").add("John");
        mapDetails.get("12345").add("Manager");
        mapDetails.get("12345").add("$157K");
        mapDetails.get("12345").add("john19@gmail.com");
        mapDetails.get("12345").add("X012KO");


         // Or put the details in the list object first and then pass the list object to the map in the end

        List<String> listDetails2 = new ArrayList<>();

        listDetails2.add("Robert");
        listDetails2.add("Head");
        listDetails2.add("$127K");
        listDetails2.add("robert19@gmail.com");
        listDetails2.add("X022AO");
        mapDetails.put("67890",listDetails2); //pass the list object to the map in the end

        mapDetails.forEach((key,value) -> {
            System.out.println(key + " : " + value);
        });


    }
}
