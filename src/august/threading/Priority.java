package august.threading;

class Priorities implements Runnable {
    Thread t;

    Priorities() {
        t = new Thread(this, "New Thread");
        System.out.println("Thread : " + t.getName());
    }

    public void seePriority(){
        System.out.println("Priority : " + t.getPriority());
    }

    public void changePriority(int num) {
        t.setPriority(num);
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread : " + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted");
        }
        System.out.println("Exiting child thread");
    }
}

public class Priority {
    public static void main(String[] args) {
        Priorities p = new Priorities();
        p.seePriority();

        p.t.start();

        int pr = 8;
        p.changePriority(pr);

        p.seePriority();

        try {
            p.t.join();
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
