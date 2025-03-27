import java.util.Scanner;

public class Q5 {
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        scanner.close();

        printNumbers(n);
    }
}