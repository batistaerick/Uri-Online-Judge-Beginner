import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        double z = x / y;
        System.out.println(String.format("%.3f", z) + " km/l");
		sc.close();
    }
}