package One;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String  w,e, c, r, t,y;
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
        String u  = w.concat(" ").concat(e).concat(" ").concat(r).concat(" ").concat(t).concat(" ").concat(y).concat(".");
        System.out.println(u);

    }
}
