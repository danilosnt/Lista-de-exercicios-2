import java.util.Scanner;

public class Q12 {

    public static int somaArray(int[] array, int n) {
        if (n <= 0) {
            return 0;
        }
        return array[n - 1] + somaArray(array, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        int soma = somaArray(array, array.length);
        System.out.println("A soma dos elementos do array é: " + soma);
    }
}