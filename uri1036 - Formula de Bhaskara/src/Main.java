import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (- b + Math.sqrt(delta)) / (2 * a);
        double x2 = (- b - Math.sqrt(delta)) / (2 * a);

        if (delta < 0 || Double.isNaN(x1) || Double.isInfinite(x1) || Double.isNaN(x2) || Double.isInfinite(x2)) {
            System.out.println("Impossivel calcular");
        } else {
            System.out.println("R1 = " + String.format("%.5f", x1));
            System.out.println("R2 = " + String.format("%.5f", x2));
        }
		sc.close();
    }
}