import java.util.Scanner;

public class Q11 {

    public static String inverterString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return inverterString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        scanner.close();

        String invertida = inverterString(entrada);
        System.out.println("A string invertida é: " + invertida);
    }
}