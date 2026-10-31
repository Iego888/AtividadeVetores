import java.util.Scanner;

public class ParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();

            if (numeros[i] % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
        }

        int[] pares = new int[qtdPares];
        int[] impares = new int[qtdImpares];
        int p = 0;
        int im = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares[p] = numeros[i];
                p++;
            } else {
                impares[im] = numeros[i];
                im++;
            }
        }

        System.out.print("\nPares: ");
        if (pares.length == 0) {
            System.out.print("nenhum");
        }
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.print("\nÍmpares: ");
        if (impares.length == 0) {
            System.out.print("nenhum");
        }
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
