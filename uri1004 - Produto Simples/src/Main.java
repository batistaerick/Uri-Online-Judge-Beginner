import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int prod = sc.nextInt() * sc.nextInt();
        System.out.println("PROD = " + prod);
		sc.close();
    }
}