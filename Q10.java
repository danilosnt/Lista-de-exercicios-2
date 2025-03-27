import java.util.Scanner;

public class Q10 {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        scanner.close();

        int resultado = fibonacci(n);
        System.out.println("O número de Fibonacci de índice " + n + " é: " + resultado);
    }
}