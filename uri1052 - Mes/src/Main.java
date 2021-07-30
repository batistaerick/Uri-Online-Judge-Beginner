import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        String[] year = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        for (int i = 0; i < year.length; i++) if (month - 1 == i) System.out.println(year[i]);
        sc.close();
    }
}
