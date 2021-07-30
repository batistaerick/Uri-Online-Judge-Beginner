import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String[] animal = { sc.next(), sc.next(), sc.next() };

        if (animal[0].equals("vertebrado")) {

            if (animal[1].equals("ave")) {
                if (animal[2].equals("carnivoro")) {
                    System.out.println("aguia");
                } else if (animal[2].equals("onivoro")) {
                    System.out.println("pomba");
                }
            } else if (animal[1].equals("mamifero")) {
                if (animal[2].equals("onivoro")) {
                    System.out.println("homem");
                } else if (animal[2].equals("herbivoro")) {
                    System.out.println("vaca");
                }
            }

        } else if (animal[0].equals("invertebrado")) {

            if (animal[1].equals("inseto")) {
                if (animal[2].equals("hematofago")) {
                    System.out.println("pulga");
                } else if (animal[2].equals("herbivoro")) {
                    System.out.println("lagarta");
                }
            } else if (animal[1].equals("anelideo")) {
                if (animal[2].equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else if (animal[2].equals("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
        sc.close();
    }
}