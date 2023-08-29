package august.threading.basics.InterthreadCommunication;

class Q{
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while(!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
            System.out.println("GOT: " + n);
            valueSet = false;
            notify();
            return n;

    }

    synchronized void put(int n){
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
            this.n = n;
            valueSet = true;
            System.out.println("PUT: " + n);
            notify();
    }
}


class Producer implements Runnable{
    Q q;
    Thread t;

    Producer(Q q){
        this.q = q;
        t = new Thread(this,"Producer");
    }

    public void run(){
        int  i = 0;
        while (true){
            q.put(i++);
        }
    }
}

class Consumer implements Runnable{
    Q q;
    Thread t;

    Consumer(Q q){
        this.q = q;
        t = new Thread(this,"Consumer");
    }

    public void run(){
        while (true){
            q.get();
        }
    }
}


public class WaitNotifyNotifyAll {
    public static void main(String[] args) {
        Q q = new Q();
        Producer p = new Producer(q);
        Consumer c = new Consumer(q);

        //start the threads

        p.t.start();
        c.t.start();

        System.out.println("Press Control C to stop");
    }

}
