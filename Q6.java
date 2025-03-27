import java.util.Scanner;

public class Q6 {
    public static void countdown(int n) {
        if (n >= 0) {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        scanner.close();

        countdown(n);
    }
}