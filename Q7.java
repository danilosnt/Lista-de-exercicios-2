import java.util.Scanner;

public class Q7 {

    public static boolean Palindromo(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        return PalindromoRecursivo(str, 0, str.length() - 1);
    }

    private static boolean PalindromoRecursivo(String str, int esquerda, int direita) {
        if (esquerda >= direita) {
            return true;
        }
        if (str.charAt(esquerda) != str.charAt(direita)) {
            return false;
        }
        return PalindromoRecursivo(str, esquerda + 1, direita - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        scanner.close();

        if (Palindromo(entrada)) {
            System.out.println("\"" + entrada + "\" é um palíndromo.");
        } else {
            System.out.println("\"" + entrada + "\" não é um palíndromo.");
        }
    }
}