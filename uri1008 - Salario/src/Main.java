import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = a * b;
        System.out.println("NUMBER = " + n);
        System.out.printf("SALARY = U$ %.2f%n", c);
		sc.close();
    }
}