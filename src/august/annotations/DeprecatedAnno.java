package august.annotations;


// does not work on interfaces

public class DeprecatedAnno {


    @Deprecated
    public void Display()
    {
        System.out.println("Deprecated display()");
    }


    public static void main(String[] args)
    {
        DeprecatedAnno d1 = new DeprecatedAnno();
        d1.Display();
    }
}
