package august.threading.basics.sync;


class CallMe{

    /**
     * We have to put synchronized keyword to restrict the different objects to call the same method(race condition)
     */
    synchronized void call(String message) {
        System.out.print("[ " + message);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(" ]");
    }
}


class Caller implements Runnable{
    String message;
    CallMe target;
    Thread t;

    public Caller(CallMe targ,String s){
        target = targ;
        message = s;
        t = new Thread(this);
    }

    public void run(){
        target.call(message);
    }
}

public class Synchronization {
    public static void main(String[] args) {
        CallMe target = new CallMe();
        Caller obj1 = new Caller(target,"Hello");
        Caller obj2 = new Caller(target,"Synced");
        Caller obj3 = new Caller(target,"World");

        //start the threads

        obj1.t.start();
        obj2.t.start();
        obj3.t.start();

        // wait for the threads to end

        try{
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        }
        catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
