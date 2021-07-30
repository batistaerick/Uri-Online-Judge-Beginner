import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int iHour = sc.nextInt();
        int iMinute = sc.nextInt();
        int fHour = sc.nextInt();
        int fMinute = sc.nextInt();
        int totalHour = (fHour * 60 + fMinute) - (iHour * 60 + iMinute);
        int totalMinute = totalHour % 60;

        if ((iHour >= 24 && iMinute >= 1) || (fHour >= 24 && fMinute >= 1)) {
            totalHour = totalHour % 24;
        }

        if (totalHour < 0) {
            totalHour = totalHour + 1440;
            totalMinute = totalHour % 60;
        }

        if (iHour == fHour && iMinute == fMinute) {
            System.out.println("O JOGO DUROU " + 24 + " HORA(S) E " + 0 + " MINUTO(S)");
        } else {
            System.out.printf("O JOGO DUROU " + (totalHour / 60) + " HORA(S) E " + totalMinute + " MINUTO(S)");
        }
        sc.close();
    }
}