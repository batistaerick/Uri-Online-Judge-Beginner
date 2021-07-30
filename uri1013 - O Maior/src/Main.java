import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int biggerAB = (a+b+Math.abs(a-b))/2;
        int biggerBC = (biggerAB+c+Math.abs(biggerAB-c))/2;

        System.out.println(biggerBC + " eh o maior");

        sc.close();
    }
}