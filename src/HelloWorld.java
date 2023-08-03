public class HelloWorld {

    // Just a block
    {
        System.out.println("This is a block");
    }


    static {
        // block
        System.out.println("Static Block");
    }

    static void staticMethod(){
        System.out.println("Static Method");
    }

    public static void main(String[] args) {


        HelloWorld obj = new HelloWorld(); // reference of a class by constructor

        System.out.println("Value of obj : " + obj);

        HelloWorld.staticMethod();

        String message = "Hello World";
        System.out.println(message);
    }

    public HelloWorld(){
        System.out.println("Constructor");
    }
}
