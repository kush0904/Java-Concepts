package august.exceptionHandling;

public class MainClass {
    int age = 62;
   void checkAge() throws OverAgException,AgeUnderException{
      if(age>28){
           throw new OverAgException("Age is over 28 ");
       }

       if(age<17){
           throw new AgeUnderException("Age under 17");
       }
    }

    void test() {
        try {
            checkAge();
        } catch (AgeUnderException | OverAgException e) {
            System.out.println("errr is ... "+e.toString());
        }
    }

    public static void main(String[] args) {
        MainClass mv = new MainClass();
        mv.test();
    }
}

class AgeUnderException extends Exception{
    public AgeUnderException(String message) {
        super(message);
    }
}

class OverAgException extends Exception{
    public OverAgException(String message) {
        super(message);
    }
}