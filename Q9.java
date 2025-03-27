import java.util.Scanner;

public class Q9 {

    public static int potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        if (expoente < 0) {
            return 1 / potencia(base, -expoente);
        }
        return base * potencia(base, expoente - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        System.out.print("Digite o expoente: ");
        int expoente = scanner.nextInt();
        scanner.close();

        int resultado = potencia(base, expoente);
        System.out.println(base + "^" + expoente + " = " + resultado);
    }
}