package august.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Player{

    private String name;
    private int age;
    private String location;

    public Player(String name, int age, String location){
        this.name=name;
        this.age=age;
        this.location=location;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }
}

public class Team {
    public static void main(String[] args) {

        List<Player> player = new ArrayList<>();

        player.add(new Player("Conor",39,"Ireland"));
        player.add(new Player("Alex",29,"Russia"));
        player.add(new Player("Joe",23,"UK"));

        for(Player p : player){
            System.out.println(p.getName() + " " + p.getAge() + " " + p.getLocation());
        }

        Iterator<Player> it = player.iterator();
        System.out.println("Using Iterator: ");
        while (it.hasNext()){
            Player p = it.next();
            System.out.println(p.getName());
        }
    }
}
