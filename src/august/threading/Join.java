package august.threading;


class JoinThread implements Runnable{
    String name;
    Thread t;

    JoinThread(String ThreadName){
        name = ThreadName;
        t = new Thread(this, name);
        System.out.println("New Thread : " + t);
    }

    public void run(){
        try{
            for (int i = 5;i>0;i--){
                System.out.println(name + " :  " + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + "interrupted");
        }
        System.out.println(name + " exiting");
    }
}

public class Join {
    public static void main(String[] args) {
        JoinThread jt1 = new JoinThread("One");
        JoinThread jt2 = new JoinThread("Two");
        JoinThread jt3 = new JoinThread("Three");

        // start the threads

        jt1.t.start();
        jt2.t.start();
        jt3.t.start();

        System.out.println("Thread 1 is alive : " + jt1.t.isAlive());
        System.out.println("Thread 2 is alive : " + jt2.t.isAlive());
        System.out.println("Thread 3 is alive : " + jt3.t.isAlive());

        // wait for the threads to finish

        try{
            System.out.println("Waiting for the threads to finish.");
            jt1.t.join();
            jt2.t.join();
            jt3.t.join();
        }
        catch (InterruptedException e){
            System.out.println("main thread interrupted");
        }
        System.out.println("Thread 1 is alive : " + jt1.t.isAlive());
        System.out.println("Thread 2 is alive : " + jt2.t.isAlive());
        System.out.println("Thread 3 is alive : " + jt3.t.isAlive());
    }
}
