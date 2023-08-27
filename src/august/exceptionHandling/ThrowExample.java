package august.exceptionHandling;


/**
 * throw keyword explicitly sends exception and throws keyword declares exception
 */

public class ThrowExample {

    public void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("You can't drive legally!!");
        }
        else{
            System.out.println("You can Drive");
        }
    }

    public static void main(String[] args) {
        ThrowExample obj = new ThrowExample();
        int age = 15;
        obj.checkAge(age);
    }

}
