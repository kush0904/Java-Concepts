package august.threading;

class counters {
    static int counter = 5;

    public void increaseByOne() {
        for (int i = 0; i < 10; i++) {
            System.out.println("After increment : " + ++counter);
        }
    }


    public void decreaseByOne() {
        for (int i = 0; i < 10; i++) {
            System.out.println("After decrement : " + --counter);
        }
    }

    public static int getCounter() {
        return counter;
    }
}
    public class SharedCounter {
        public static void main(String[] args) {
            final counters obj = new counters();

            Thread t1 = new Thread() {
                @Override
                public void run() {
                    obj.increaseByOne();
                }
            };
            Thread t2 = new Thread() {
                @Override
                public void run() {
                    obj.decreaseByOne();
                }
            };

            t1.start();
            t2.start();

        }
    }
