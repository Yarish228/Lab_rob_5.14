package Two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String w, e, c, r, t, y;
        Scanner q = new Scanner(System.in);
        System.out.println("1 слово: ");
        w = q.nextLine();
        System.out.println("2 слово: ");
        e = q.nextLine();
        System.out.println("3 слово: ");
        r = q.nextLine();
        System.out.println("4 слово: ");
        t = q.nextLine();
        System.out.println("5 слово: ");
        y = q.nextLine();
        System.out.println();
        System.out.println(w.substring(0,1));
        System.out.println(e.substring(0,1));
        System.out.println(r.substring(0,1));
        System.out.println(t.substring(0,1));
        System.out.println(y.substring(0,1));
    }
}