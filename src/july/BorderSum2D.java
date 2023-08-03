package july;
import java.util.Scanner;

public class BorderSum2D {

    public static int sumOfBorderElements(int[][] arr, int r, int c) {
        int sum = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r - 1 || j == 0 || j == c - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static int sumOfElementsAroundMid(int[][] arr, int r, int c) {

        int m = r / 2;
        int n = c / 2;
        int sum = 0;

        for (int i = m - 1; i <= m + 1; i++) {
            for (int j = n - 1; j <= n + 1; j++) {
                if (!(i == m && j == n)) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int r, c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        r = sc.nextInt();
        System.out.println("Enter number of columns");
        c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter " + r + " x " + c + " values");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum1 = sumOfBorderElements(arr,r,c);
        int sum2 = sumOfElementsAroundMid(arr,r,c);

        System.out.println("Sum of border elements: " + sum1);
        System.out.println("Sum of elements around mid: " + sum2);
        System.out.println("Difference of both the sums: " + Math.abs(sum1-sum2) );
    }
}



// Sample Input

/*
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/


/*
Different Approach:

        package july;

        import java.util.Scanner;

public class BorderSum2D{

    public static void main(String[] args) {

        int r,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows");
        r = sc.nextInt();
        System.out.println("Enter number of rows");
        c = sc.nextInt();

        int arr[][] = new int[r][c];

        System.out.println("Enter " + r  + " x " + c  + " values" );
        for(int i = 0;i<r;i++){
            for(int j = 0 ;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum1 = 0;

        int i, left = 0, right = c-1, top = 0, bottom = r-1;

        for (i = left; i <= right; i++) {
            sum1+=arr[top][i];
        }
        top++;
        for (i = top; i <= bottom; i++) {
            sum1+=arr[i][right];
        }
        right--;

        if (top <= bottom) {
            for (i = right; i >= left; i--) {
                sum1+=arr[bottom][i];
            }
            bottom--;
        }
        if (left <= right) {
            for (i = bottom; i >= top; i--) {
                sum1+=arr[i][left];
            }
            left++;
        }

        int m = r/2;
        int n = c/2;

        int sum2 = 0;
        int j, l = m-1, ri = m+1, t = n-1, b = n+1;

        for (j = l; j <= ri; j++) {
            sum2+=arr[t][j];
        }
        t++;
        for (j = t; j <= b; j++) {
            sum2+=arr[j][ri];
        }
        ri--;

        if (t <= b) {
            for (j = ri; j >= l; j--) {
                sum2+=arr[b][j];
            }
            b--;
        }
        if (l <= ri) {
            for (j = b; j >= t; j--) {
                sum2+=arr[j][l];
            }
            l++;
        }




        System.out.println("Sum of border elements : " + sum1);
        System.out.println("Sum of elements around mid : " + sum2);
    }
}*/
