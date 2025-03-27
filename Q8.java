import java.util.Scanner;

public class Q8 {

    public static int somaNaturais(int n) {
        if (n <= 1) {
            return n;
        }
        return n + somaNaturais(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();
        scanner.close();

        int soma = somaNaturais(n);
        System.out.println("A soma dos primeiros " + n + " números naturais é: " + soma);
    }
}