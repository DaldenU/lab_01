import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findBinomialCoefficient(n, k));
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

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static int powerOf(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            n -= 1;
            return a * powerOf(a, n);
        }

    }

    public static int findBinomialCoefficient(int n, int k) {
        if(k == 0 || k == n) {
            return 1;
        } else {
            return findBinomialCoefficient(n-1, k-1) + findBinomialCoefficient(n-1, k);
        }

    }
}