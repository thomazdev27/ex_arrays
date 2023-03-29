import java.util.Scanner;

public class Consoantes_ex2 {
    public Consoantes_ex2() {
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") | letra.equalsIgnoreCase("i") | letra.equalsIgnoreCase("o") | letra.equalsIgnoreCase("u"))) {
                consoantes[count] = letra;
                ++quantidadeConsoantes;
            }

            ++count;
        } while(count < consoantes.length);

        System.out.print("Consoantes: ");
        String[] var9 = consoantes;
        int var6 = consoantes.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            String consoante = var9[var7];
            if (consoante != null) {
                System.out.print(consoante + " ");
            }
        }

        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);
        System.out.println(consoantes.length);
    }
}
