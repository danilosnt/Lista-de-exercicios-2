import java.util.Scanner;

public class Q14 {

    public static int maiorElemento(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        return Math.max(array[n - 1], maiorElemento(array, n - 1));
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

        int maior = maiorElemento(array, array.length);
        System.out.println("O maior elemento do array é: " + maior);
    }
}