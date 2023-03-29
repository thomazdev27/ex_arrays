public class Ordem_Inversa_ex4 {
    public static void main(String[] args) {

        int[] vetor = new int[]{-5, -6, 15, 50, 8, 4};
        System.out.print("Vetor: ");

        for (int j : vetor) {
            System.out.print(j + " ");
        }

        System.out.print("\nVetor: ");

        for(int i = vetor.length - 1; i >= 0; --i) {
            System.out.print(vetor[i] + " ");
        }

    }

    }
