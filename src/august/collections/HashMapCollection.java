package august.collections;


import java.util.HashMap;
import java.util.Map;

public class HashMapCollection {
    public static void main(String[] args) {
        HashMap<Integer, String> data = new HashMap<>();

        data.put(101, "Mercury");
        data.put(102, "Venus");
        data.put(103, "Earth");
        data.put(104, "Mars");
        data.put(105, "Jupiter");
        data.put(106, "Saturn");
        data.put(107, "Uranus");
        data.put(108, "Sun");

        data.put(108, "Neptune"); //Update the existing value

        System.out.println(data.size());

        System.out.println(data.get(106));

        System.out.println(data.containsKey(102));

        System.out.println(data.remove(108));

        System.out.println(data);

        for(Map.Entry<Integer,String> entry : data.entrySet()){
            System.out.println(entry.getKey() + " : "  + entry.getValue());
        }

        for(Integer key : data.keySet()){
            System.out.println(key);
        }



        for(String value : data.values()){
            System.out.println(value);
        }

        data.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });
        //Or it can be written as
        data.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
