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
        int min = findMin(arr, num);
        System.out.println("The minimum of the array elements is: " + min);
    }

    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        } else {
            int min = findMin(arr, n-1);
            return Math.min(min, arr[n-1]);
        }

    }

}