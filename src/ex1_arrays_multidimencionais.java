import java.util.Random;

public class ex1_arrays_multidimencionais {
    public ex1_arrays_multidimencionais() {
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[][] M = new int[4][4];

        int j;
        for(int i = 0; i < M.length; ++i) {
            for(j = 0; j < M[i].length; ++j) {
                M[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        int[][] var11 = M;
        j = M.length;

        for(int var5 = 0; var5 < j; ++var5) {
            int[] linha = var11[var5];
            int[] var7 = linha;
            int var8 = linha.length;

            for(int var9 = 0; var9 < var8; ++var9) {
                int coluna = var7[var9];
                System.out.print("" + coluna + " ");
            }

            System.out.println();
        }

    }
}

