package Alpha.Recursion;
public class fibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.print(0 + " " + 1);
        for (int i = 2; i <= n - 2; i++) {
            System.out.print(" " + fib(i));
        }
    }
}

