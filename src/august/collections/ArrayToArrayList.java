package august.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

    public static void main(String[] args) {
        String[] names = new String[] {"Steve", "Alex", "John", "Joe"};

        //Using Arrays.asList() method
        ArrayList<String> listOfNames1 = new ArrayList<String>(Arrays.asList(names));
        System.out.println(listOfNames1);

        //Using Collections.addAll() method
        ArrayList<String> listOfNames2 = new ArrayList<String>();
        Collections.addAll(listOfNames2,names);
        System.out.println(listOfNames2);

        //Using ArraysList.addAll() method
        ArrayList<String> listOfNames3 = new ArrayList<String>();
        listOfNames3.addAll(Arrays.asList(names));
        System.out.println(listOfNames3);

    }
}
