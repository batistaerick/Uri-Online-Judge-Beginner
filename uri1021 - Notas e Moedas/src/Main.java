import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        if (0 < valor && valor < 1000000.00) {
            double[] notas = { 100, 50, 20, 10, 5, 2 };
            double[] moedas = { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };

            System.out.println("NOTAS:");
            for (double nota : notas) {
                int total_notas = (int) (valor / nota);
                System.out.println(total_notas + " nota(s) de R$ " + String.format("%.2f", nota));
                valor -= total_notas * nota;
            }

            System.out.println("MOEDAS:");
            for (double moeda : moedas) {
                int total_moedas = (int) (valor / moeda);
                System.out.println(total_moedas + " moeda(s) de R$ " + String.format("%.2f", moeda));
                valor -= total_moedas * moeda;
            }
        }
        sc.close();
    }
}