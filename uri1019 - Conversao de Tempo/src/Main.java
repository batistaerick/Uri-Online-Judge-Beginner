import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(((x / 60 / 60) % 60) + ":" + ((x / 60) % 60) + ":" + (x % 60));
		sc.close();
    }
}