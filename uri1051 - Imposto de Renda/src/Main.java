import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        if (salary >= 0 && salary <= 2000) {
            System.out.println("Isento");
        } else if (salary > 2000 && salary <= 3000) {
            System.out.println(String.format("R$ %.2f", ((salary - 2000) * 0.08)));
        } else if (salary > 3000 && salary <= 4500) {
            System.out.println(String.format("R$ %.2f", ((salary - 3000) * 0.18) + 80));
        } else if (salary > 4500) {
            System.out.println(String.format("R$ %.2f", ((salary - 4500) * 0.28) + 350));
        }
        sc.close();
    }
}