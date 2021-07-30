import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cod = sc.nextInt();
        int quant = sc.nextInt();

        List<Table> list = new ArrayList<>();
        list.add(new Table(1, "Cachorro Quente", 4.00));
        list.add(new Table(2, "X-Salada", 4.50));
        list.add(new Table(3, "X-Bacon", 5.00));
        list.add(new Table(4, "Torrada simples", 2.00));
        list.add(new Table(5, "Refrigerante", 1.50));

        for (Table table : list) {
            if (table.getCod() == cod) {
                System.out.println("Total: R$ " + String.format("%.2f", table.getPrice() * quant));
            }
        }
        sc.close();
    }

    public static class Table {
        private int cod;
        private String spec;
        private double price;

        public Table(int cod, String spec, double price) {
            this.cod = cod;
            this.spec = spec;
            this.price = price;
        }

        public int getCod() {
            return cod;
        }

        public String getSpec() {
            return spec;
        }

        public double getPrice() {
            return price;
        }
    }
}