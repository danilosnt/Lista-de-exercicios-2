import java.util.Scanner;

public class Q1 {
    public static int CalculaMDC(int m, int n) {
        if (n == 0) {
            return m;
        }
        return CalculaMDC(n, m % n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de m: ");
        int m = scanner.nextInt();
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("MDC de " + m + " e " + n + " é: " + CalculaMDC(m, n));
    }
}