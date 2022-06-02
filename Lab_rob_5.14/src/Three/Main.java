package Three;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double q, w, e;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть перше дробове число: ");
        if (scan.hasNextDouble()) {
            q = scan.nextDouble();
            System.out.println("Введіть друге дробове число: ");
            w = scan.nextDouble();
            System.out.println("Введіть третє дробове число: ");
            e = scan.nextDouble();
            System.out.println();
            if (q > w && q > e) {
                System.out.println("Найбільше дробове число: " + q);
            } else if (q == w && q > e) {
                System.out.println("Найбільше дробове число: " + q);
            } else if (w > q && w > e) {
                System.out.println("Найбільше дробове число: " + w);
            } else if (q == e && e < w) {
                System.out.println("Найбільше дробове число: " + w);
            } else if (e > q && e > w) {
                System.out.println("Найбільше дробове число: " + e);
            } else if (q == w && e > w) {
                System.out.println("Найбільше дробове число: " + e);
            } else if (q == w && e < w && e < q) {
                System.out.println("Перше і друге число однакові та їх значення: " + q + " більше за третє");
            } else if (q == e && e > w && q > w) {
                System.out.println("Перше і третє число однакові та їх значення: " + e + " більше за друге");
            } else if (e == w && e > q && w > q) {
                System.out.println("Друге і третє число однакові та їх значення: " + w + " більше за перше");
            } else if ( q == w && e == w ){
                System.out.println("Всі числа однакові.");
            }
        } else {
            System.out.println("Введено не дробове число.");
        }
    }
}