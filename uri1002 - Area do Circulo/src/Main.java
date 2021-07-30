import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double area = 3.14159 * Math.pow(sc.nextDouble(), 2); 
        System.out.printf("A=%.4f%n", area);
		sc.close();
    }
}