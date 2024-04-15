import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[9];

        for (int i = 0; i < 9; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if (isPrimo(vetor[i])) {
                System.out.println("Número primo: " + vetor[i] + ", posição: " + i);
            }
        }
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}