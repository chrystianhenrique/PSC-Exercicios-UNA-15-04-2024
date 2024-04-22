import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Este programa separa números positivos e negativos de um vetor.");
        System.out.println("Por favor, digite 8 números:");

        Scanner scanner = new Scanner(System.in);

        int[] vetorOriginal = new int[8];
        int[] vetorPositivo = new int[8];
        int[] vetorNegativo = new int[8];
        int countPositivos = 0;
        int countNegativos = 0;

        for (int i = 0; i < 8; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            if (vetorOriginal[i] > 0) {
                vetorPositivo[countPositivos] = vetorOriginal[i];
                countPositivos++;
            } else if (vetorOriginal[i] < 0) {
                vetorNegativo[countNegativos] = vetorOriginal[i];
                countNegativos++;
            }
        }

        for (int i = 0; i < countPositivos; i++) {
            System.out.print(vetorPositivo[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < countNegativos; i++) {
            System.out.print(vetorNegativo[i] + " ");
        }

        scanner.close();
    }
}