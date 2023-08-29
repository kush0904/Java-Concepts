package august.collections;

import java.util.Collection;
import java.util.ArrayList;

public class ArrayListC {

    public static void main(String[] args) {

        ArrayList<String> player = new ArrayList<>();
        player.add("P1");
        player.add("P2");
        player.add("P3");
        player.add("P4");
        player.add("P5");
        player.add("P6");

        for(Object name : player){
            System.out.println(name);
        }

    }
}
