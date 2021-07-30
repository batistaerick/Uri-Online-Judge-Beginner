import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        float[] vet = {sc.nextFloat(), sc.nextFloat(), sc.nextFloat()};
        Arrays.sort(vet);

        if (vet[2] >= vet[1] + vet[0]) System.out.println("NAO FORMA TRIANGULO");
        else if (vet[2] * vet[2] == vet[1] * vet[1] + vet[0] * vet[0]) System.out.println("TRIANGULO RETANGULO");
        else if (vet[2] * vet[2] > vet[1] * vet[1] + vet[0] * vet[0]) System.out.println("TRIANGULO OBTUSANGULO");
        else if (vet[2] * vet[2] < vet[1] * vet[1] + vet[0] * vet[0]) System.out.println("TRIANGULO ACUTANGULO");
        if (vet[2] == vet[1] && vet[1] == vet[0]) System.out.println("TRIANGULO EQUILATERO");
        else if (vet[2] == vet[1] || vet[2] == vet[0] || vet[1] == vet[0]) System.out.println("TRIANGULO ISOSCELES");
        sc.close();
    }
}