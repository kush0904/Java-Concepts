package august.threading.basics;

class ThreadNew implements Runnable{

    Thread t;

    ThreadNew(){
        t = new Thread(this, "New Thread");
        System.out.println("Child Thread : " + t);
    }

    public void run(){
        try{
            for(int  i = 5;i>0;i--){
                System.out.println("Child Thread : " + i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e){
            System.out.println("Child Interrupted");
        }
        System.out.println("Exiting child thread");
    }
}


class NewThread{
    public static void main(String[] args) {
        ThreadNew tn = new ThreadNew();

        tn.t.start();

        try{
            for(int i = 5;i>0;i--){
                System.out.println("Main : " + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e){
            System.out.println("Main interrupted");
        }
        System.out.println("Main thread exiting");
    }
}