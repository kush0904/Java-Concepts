package august.wrapperClasses;


// valueOf() ---------> primitive to wrapper  (autoboxing)
// intValue() ---------> wrapper to primitive (unboxing)
public class WrapperClass {

    public static void main(String[] args) {

        int i = 10;
        int j = 20;
        System.out.println("Sum : " + i + j);
        System.out.println("Sum : " + (i + j));


        Integer a = 10;
        Integer b = 20;
        System.out.println("Sum : " + a + b);
        System.out.println("Sum : " + (a + i+b));

        Integer obj1 = new Integer(50);
        Integer obj2 = new Integer(60);
        System.out.println("Sum : " + obj1 + obj2);
        System.out.println("Sum : " + (obj1 + obj2));


        Integer obj3 = Integer.valueOf(500);
        System.out.println("obj3 : " + obj3);

        Integer obj4 = 90;
        int k = obj4.intValue(); // convert wrapper to primitive data type
        System.out.println("K : " + k);


    }
}
