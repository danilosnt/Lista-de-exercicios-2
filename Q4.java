import java.util.Scanner;

public class Q4 {
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = sumDigits(number);
        System.out.println("A soma dos algarismos de " + number + " é: " + sum);
    }
}