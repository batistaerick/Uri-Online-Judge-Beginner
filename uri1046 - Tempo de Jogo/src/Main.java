import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int initialTime = sc.nextInt();
        int finalTime = sc.nextInt();
        if (initialTime > finalTime)
            System.out.println("O JOGO DUROU " + ((24 - initialTime) + finalTime) + " HORA(S)");
        if (initialTime < finalTime)
            System.out.println("O JOGO DUROU " + (finalTime - initialTime) + " HORA(S)");
        if (initialTime == finalTime)
            System.out.println("O JOGO DUROU 24 HORA(S)");
        sc.close();
    }
}