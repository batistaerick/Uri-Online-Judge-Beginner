import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double trianguloRetangulo = a * c / 2;
        double circulo = 3.14159 * Math.pow(c, 2);
        double trapezio = (a + b) * c / 2;
        double quadrado = b * b;
        double retangulo = a * b;
        
        System.out.printf("TRIANGULO: %.3f%n", trianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
		sc.close();
    }
}