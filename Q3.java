import java.util.Scanner;

public class Q3 {
    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return decimalToBinary(n / 2) + (n % 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para converter para binário: ");
        int number = scanner.nextInt();
        scanner.close();

        String binary = decimalToBinary(number);
        System.out.println("A representação binária de " + number + " é: " + binary);
    }
}