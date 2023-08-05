package august.enums;


enum Level {
    AMATEUR, SKILLED, PROFESSIONAL
}
public class Stages {
    public static void main(String[] args) {
        Level rank = Level.PROFESSIONAL;
        System.out.println("You are " + rank);
    }

}
