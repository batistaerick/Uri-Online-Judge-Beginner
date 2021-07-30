import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        Integer x = sc.nextInt();

        Object[][] ddd = { { 61, "Brasilia" }, { 71, "Salvador" }, { 11, "Sao Paulo" }, { 21, "Rio de Janeiro" },
                { 32, "Juiz de Fora" }, { 19, "Campinas" }, { 27, "Vitoria" }, { 31, "Belo Horizonte" } };

        for (int i = 0; i < ddd.length; i++) {
            if (x.equals(ddd[i][0])) {
                System.out.println(ddd[i][1]);
                break;
            } else if (i == ddd.length - 1) {
                System.out.println("DDD nao cadastrado");
            }
        }
        sc.close();
    }
}