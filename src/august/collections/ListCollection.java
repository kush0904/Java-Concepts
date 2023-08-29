package august.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

    public static void main(String[] args) {

        List<String> player = new ArrayList<>();
        player.add("P1");
        player.add("P2");
        player.add("P3");
        player.add("P4");
        player.add("P5");
        player.add("P6");

        System.out.println("Old players");
        for(String name : player){
            System.out.println(name);
        }


        ArrayList<String> newPlayers = new ArrayList<>(player);
        System.out.println("New players");
        for(String name : newPlayers){
            System.out.println(name);
        }
    }
}
