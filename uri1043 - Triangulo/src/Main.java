import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if ((b - c < a && a < b + c) && (a - c < b && b < a + c) && (a - b < c && c < a + b)) {
            System.out.println(String.format("Perimetro = %.1f", (a + b + c)));
        } else {
            System.out.println(String.format("Area = %.1f", (((a + b) * c) / 2)));
        }
		sc.close();
    }
}