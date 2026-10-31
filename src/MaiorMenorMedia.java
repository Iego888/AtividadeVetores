import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            soma += numeros[i];
        }

        double media = (double) soma / numeros.length;

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.printf("Média: %.2f%n", media);

        sc.close();
    }
}