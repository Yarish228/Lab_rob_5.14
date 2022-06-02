package Four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String w , e;
        Scanner q = new Scanner(System.in);
        System.out.println("Введіть 1 ім'я': ");
        w = q.nextLine();
        System.out.println("Введіть 2 ім'я: ");
        e = q.nextLine();
        System.out.println();
        if (w.equalsIgnoreCase(e)) {
            System.out.println("1 і 2 ім'я Ідентичні");
        }
        else {
            System.out.println("Імена різні");
        }
    }
}