import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.printf("VOLUME = %.3f%n", volume(sc.nextDouble()));
		sc.close();
    }
    
    public static double volume(double radius) {
        return 4.0 / 3.0 * 3.14159 * Math.pow(radius, 3);
    }
}