import java.util.Scanner;

public class BuscaFrequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("\nDigite o número que deseja buscar: ");
        int busca = sc.nextInt();

        int frequencia = 0;
        String posicoes = "";

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == busca) {
                frequencia++;
                posicoes += i + " ";
            }
        }

        if (frequencia > 0) {
            System.out.println("\nO número " + busca + " está presente no vetor.");
            System.out.println("Frequência: " + frequencia + " vez(es)");
            System.out.println("Posições (índices): " + posicoes.trim());
        } else {
            System.out.println("\nO número " + busca + " NÃO está presente no vetor.");
        }

        sc.close();
    }
}
