import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < num; i++){
            arr[i] = sc.nextInt();
        }
        double sum = findAverage(arr, num);
        System.out.println(sum / num);
    }

    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int min = findMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }

    }

    public static double findAverage(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            double sum = findAverage(arr, n-1);
            return sum + arr[n-1];
        }
    }

}