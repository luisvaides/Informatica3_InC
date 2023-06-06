import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = scanner.nextInt();

        System.out.println(factorial(num, ""));
    }

    public static int factorial(int n, String indent) {
        System.out.println(indent + n + "!");
        if(n == 0) {
            System.out.println(indent + "1");
            return 1;
        } else {
            int result = n * factorial(n - 1, indent + n + "x");
            System.out.println(indent + result);
            return result;
        }
    }
}
