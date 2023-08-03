package july;

import java.util.Scanner;

public class Calculator {
    public static void add(float a, float b){
        System.out.println(a+b);
    }
    public static void sub(float a, float b){
        System.out.println(a-b);
    }
    public static void mul(float a, float b){
        System.out.println(a*b);
    }
    public static void div(float a, float b){
        System.out.println(a/b);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number");
        float val1 = input.nextFloat();

        System.out.println("Enter another number");
        float val2 = input.nextFloat();

        System.out.println("Enter an operator");
        char opr = input.next().charAt(0);

        System.out.println("Result : ");

        switch (opr)
        {
            case '+':
                add(val1,val2);
                break;
            case '-':
                sub(val1,val2);
                break;
            case '*':
                mul(val1,val2);
                break;
            case '/':
                div(val1,val2);
                break;
            default:
                System.out.println("Thanks");
        }
    }
}





