import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: F");
        int num = scanner.nextInt() ;

        System.out.println("F" + num + " = " + fibonacci(num));
        
    }

    public static int fibonacci (int n) {
        if(n <= 1) {
            System.out.println(n);
            return n;
        } else {
            System.out.println("F" + n + " = F" + (n - 1) + " + F" + (n - 2));
            int fib_n1 = fibonacci(n - 1);
            int fib_n2 = fibonacci(n - 2);
            System.out.print(fib_n1 + " + " + fib_n2);
            int result = fib_n1 + fib_n2;
            System.out.println(" = " + result);
            return result;
        }

    }
}
