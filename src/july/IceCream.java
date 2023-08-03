package july;
import java.util.Arrays;
import java.util.Scanner;

public class IceCream {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] iceCream = new String[5];
        int[] cost = new int[5];

        for (int i = 0; i < cost.length; i++) {
            System.out.println("Enter Ice-Cream");
            iceCream[i] = sc.next();
            System.out.println("Enter its cost");
            cost[i] = sc.nextInt();
        }

        Arrays.sort(cost);

        /*for (int i = 0; i < cost.length - 1; i++) {
            for (int j = 0; j < cost.length - i - 1; j++) {
                if (cost[j] > cost[j + 1]) {
                    int tempCost = cost[j];
                    cost[j] = cost[j + 1];
                    cost[j + 1] = tempCost;

                    String tempIceCream = iceCream[j];
                    iceCream[j] = iceCream[j + 1];
                    iceCream[j + 1] = tempIceCream;
                }
            }
        }

        System.out.println("Sorted Ice Cream by Cost:");*/


        for (int i = 0; i < iceCream.length; i++) {
            System.out.println(iceCream[i] + " : " + cost[i]);
        }


        System.out.println("Hash Code of the Cost Array : " + Arrays.hashCode(cost));

        System.out.println("Max Cost : " + cost[cost.length-1] );
    }
}
