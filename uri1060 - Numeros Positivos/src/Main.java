import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[6];
        int positives = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
            if (numbers[i] > 0) {
                positives++;
            }
        }
        System.out.println(positives + " valores positivos");
        sc.close();
    }
}
