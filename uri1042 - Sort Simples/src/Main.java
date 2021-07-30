import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int[] vet1 = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        int[] vet2 = vet1.clone();
        Arrays.sort(vet2);

        for (int i : vet2) System.out.println(i);
        
        System.out.println();

        for (int i : vet1) System.out.println(i);

        sc.close();
    }
}