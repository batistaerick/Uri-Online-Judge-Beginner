import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println(String.format("%.3f", speed(sc.nextDouble(), sc.nextDouble())));
		sc.close();
    }

    public static double speed(double x, double y) {
        return (y * x) / 12;
    }
}