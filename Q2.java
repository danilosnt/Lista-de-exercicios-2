import java.util.Scanner;

public class Q2 {
    public static int calculateFactorial(int x) {
        if (x == 0) {
            return 1;
        }
        return x * calculateFactorial(x - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int x = scanner.nextInt();
        scanner.close();

        int result = calculateFactorial(x);
        System.out.println("O fatorial de " + x + " é: " + result);
    }
}