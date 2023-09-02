package august.collections;

import java.util.Collection;
import java.util.HashSet;

public class HashSetCollection {
    public static void main(String[] args) {
        Collection<String> player = new HashSet<>();
        player.add("P1");
        player.add("P2");
        player.add("P3");
        player.add("P4");
        player.add("P5");
        player.add("P6");

        for (String name : player) {
            System.out.println(name);
        }
    }
}