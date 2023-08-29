package august.threading.basics;

class Car  extends Thread{
    public Car(String str) {
        super(str);
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println(i+" "+getName());
            try {
                sleep((long) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("DONE! "+getName() );
    }
}
public class Race{
    public static void main(String[] args) {
        new Car("R8").start();
        new Car("M5").start();
        new Car("AMG").start();
    }
}