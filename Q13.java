import java.util.Scanner;

public class Q13 {

    public static int contarCaracter(String str, char c) {
        if (str.isEmpty()) {
            return 0;
        }
        int count = (str.charAt(0) == c) ? 1 : 0;
        return count + contarCaracter(str.substring(1), c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        System.out.print("Digite um caractere: ");
        char caractere = scanner.next().charAt(0);
        scanner.close();

        int resultado = contarCaracter(entrada, caractere);
        System.out.println("O caractere '" + caractere + "' aparece " + resultado + " vezes na string.");
    }
}