package august.annotations;

class DeprecatedTest {
    @Deprecated
    public void Display()
    {
        System.out.println("DeprecatedTest display()");
    }
}

public class SuppressWarning {
    @SuppressWarnings({"unused", "deprecation"})
    public static void main(String[] args) {
        DeprecatedTest d1 = new DeprecatedTest();
        d1.Display();
    }
}