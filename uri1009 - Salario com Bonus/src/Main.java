import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double salary = sc.nextDouble();
        double sales = sc.nextDouble();
        double total = (sales * 15 / 100) + salary;
        System.out.printf("TOTAL = R$ %.2f%n", total);
		sc.close();
    }
}