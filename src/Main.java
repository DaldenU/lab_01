import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(!findPrime(num, (int) Math.sqrt(num))) {
            System.out.println("Composite");
        } else{
            System.out.println("Prime");
        }
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

    public static boolean findPrime(int num, int i) {
        if (i <= 1) {
            return true;
        }
        if(num % i == 0) {
            return false;
        } else {
            return findPrime(num, i - 1);
        }

    }

}