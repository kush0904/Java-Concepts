package july.stringsTut;

public class Equals {
    public static void main(String[] args) {
        String a = new String("a");
        String b = new String("a");

        System.out.println(a==b); //false

        String c = a;
        System.out.println(a==c); //true


        String d = new String("aa");
        String e = new String("aa");

        System.out.println(d.equals(e));  //true

        String f = d;
        System.out.println(d.equals(f));  //true


        System.out.println(f.isEmpty()); // false

    }
}
