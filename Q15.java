import java.util.Scanner;

public class Q15 {

    public static int calcularMMC(int a, int b) {
        return (a * b) / calcularMDC(a, b);
    }

    private static int calcularMDC(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMDC(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        scanner.close();

        int mmc = calcularMMC(num1, num2);
        System.out.println("O mínimo múltiplo comum de " + num1 + " e " + num2 + " é: " + mmc);
    }
}