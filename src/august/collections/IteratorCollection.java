package august.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorCollection {
    public static void main(String[] args) {
        ArrayList<String> player = new ArrayList<>();
        player.add("P1");
        player.add("P2");
        player.add("P3");
        player.add("P4");
        player.add("P5");
        player.add("P6");


        Iterator<String> teamIterator = player.iterator();
        System.out.println("Normal iterator");
        while(teamIterator.hasNext()){
            String p = teamIterator.next();
            System.out.println(p);
        }

        ListIterator<String> teamListIterator = player.listIterator(player.size());
        System.out.println("List iterator");
        while(teamListIterator.hasPrevious()){
            String k = teamListIterator.previous();
            System.out.println(k);
        }

    }
}
