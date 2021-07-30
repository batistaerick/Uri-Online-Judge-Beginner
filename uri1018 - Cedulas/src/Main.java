import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        float valor = sc.nextFloat();

        if (0 < valor && valor < 1000000) {
            int[] notas = { 100, 50, 20, 10, 5, 2, 1 };
            System.out.println((int) valor);
            for (float nota : notas) {
                int total_notas = (int) (valor / nota);
                System.out.println(total_notas + " nota(s) de R$ " + String.format("%.0f", nota) + ",00");
                valor -= total_notas * nota;
            }
        }
        sc.close();
    }
}