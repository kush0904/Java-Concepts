package september.generics;


// T is the keyword for template
public class Box<T> {

    private T obj;

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {

        // Specify the type parameter when creating the Box object
        Box<String> stringBox = new Box<>();
        stringBox.setObj(new String("Candy"));
        System.out.println(stringBox.getObj());

        stringBox.setObj(new String("Pizza"));
        System.out.println(stringBox.getObj());


        // Create new object for Double type values
        Box<Double> money = new Box<>();
        money.setObj(new Double(1000.00));
        System.out.println(money.getObj());
    }
}
