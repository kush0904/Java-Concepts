package august.threading.basics;


// controlling the main thread


/**
 * the main thread is the first thread that is run, we can control it
 * by getting an instance of that Thread Class, and it should be the last to execute as it has all the shutdown features
 * Main thread should always execute at the last
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Current Thread : " + t);

        t.setName("My thread");
        System.out.println("After changing name : " + t);

        try{
            for(int n = 5;n>0;n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("main thread interrupted");
        }
    }
}
