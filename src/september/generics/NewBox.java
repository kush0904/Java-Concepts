package september.generics;


// T is the keyword for template
public class NewBox<T> {

    private T[] boxData;

    public NewBox(T[] boxData){
        this.boxData = boxData;
    }

    public<T> void showBoxData(T[] boxData){
        for(T data:boxData){
            System.out.print(data + " ");
        }
        System.out.println();
    }

    public void inspect(){
        System.out.println("T: " + boxData.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        String[] items = {"Pizza", "Burger", "Coke", "Fries", "Wrap"};

        NewBox<String> sObject = new NewBox<>(items);
        sObject.showBoxData(items);
        sObject.inspect();


        Double[] price = {800.00, 100.00, 60.00, 80.00, 60.00};

        NewBox<Double> pObject = new NewBox<>(price);
        pObject.showBoxData(price);
        pObject.inspect();
    }
}
