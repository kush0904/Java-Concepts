package august.threading.basics;


class NewThreading extends Thread{
    NewThreading(){
        super("Demo Thread");
        System.out.println("Child Thread " + this);
    }

    public void run(){
        try {
            for(int i = 5;i>0;i--){
                System.out.println("Child Thread : " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Child interrupted");
        }
        System.out.println("Exiting child thread");
    }
}


public class ExtendThread {
    public static void main(String[] args) {
        NewThreading nt = new NewThreading();
        nt.start();
        try {
            for(int i = 5;i>0;i--){
                System.out.println("Main thread : "+ i );
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread");
    }
}
