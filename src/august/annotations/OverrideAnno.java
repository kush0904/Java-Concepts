package august.annotations;

abstract class Salary{
    public abstract void method1();

}


public class OverrideAnno extends Salary {
    @Override
    public void method1(){
        System.out.println("Method Function");
    }

    public static void main(String[] args) {
        OverrideAnno obj = new OverrideAnno();
        obj.method1();
    }
}
