import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo (N): ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("N deve ser maior que 1.");
        } else {
            boolean[] numerosPrimos = new boolean[n + 1];
            int divisoes = 0;

            for (int i = 2; i <= n; i++) {
                numerosPrimos[i] = true;
            }

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (numerosPrimos[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        divisoes++;
                        numerosPrimos[j] = false;
                    }
                }
            }

            System.out.println("Números primos entre 1 e " + n + ":");
            for (int i = 2; i <= n; i++) {
                if (numerosPrimos[i]) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\nNúmero total de divisões realizadas: " + divisoes);
        }

        scanner.close();
    }
}
