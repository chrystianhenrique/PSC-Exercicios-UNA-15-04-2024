import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] vetor1 = preencherVetor();
        int[] vetor2 = preencherVetor();
        int[] vetorIntercalado = intercalarVetores(vetor1, vetor2);

        System.out.println("Vetor resultante da intercalação:");
        System.out.println(Arrays.toString(vetorIntercalado));
    }

    public static int[] preencherVetor() {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100) + 1;
        }
        return vetor;
    }

    public static int[] intercalarVetores(int[] vetor1, int[] vetor2) {
        int[] vetorIntercalado = new int[vetor1.length + vetor2.length];
        int index = 0;

        for (int i = 0; i < vetor1.length; i++) {
            vetorIntercalado[index] = vetor1[i];
            index++;
            vetorIntercalado[index] = vetor2[i];
            index++;
        }
        return vetorIntercalado;
    }
}